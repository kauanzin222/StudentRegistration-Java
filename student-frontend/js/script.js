$('#inputPhone').mask('(00) 00000-0000');

var courses = [];

var periods = [
    { id: 1, name: "Manhã" },
    { id: 2, name: "Tarde" },
    { id: 3, name: "Noturno" },
];

var students = [];

loadCourses();
loadStudents();

function loadCourses() {
    $.ajax({
        url: "http://localhost:8080/courses",
        type: "GET",
        async: false,
        success: (response) => {

            courses = response;

            for (let c of courses) {
                $("#selectCourse").append(`<option value=${c.id}>${c.name}</option>`)
            }
        }
    })
}

function loadStudents() {
    $.getJSON("http://localhost:8080/students", (response) => {
        students = response;

        for (let student of students) {
            addNewRow(student);
        }
    })
}

function save() {

    /* Colocando os valores em um vetor */
    var student =
    {
        id: students.length + 1,
        name: document.getElementById("inputName").value,
        email: document.getElementById("inputEmail").value,
        phone: document.getElementById("inputPhone").value,
        idCourse: document.getElementById("selectCourse").value,
        period: getRadioValue(),
    }

    addNewRow(student);

    students.push(student);

    document.getElementById("formAluno").reset();

    //console.log(aluno);
};

function getRadioValue() {
    radios = document.getElementsByName("gridRadios");

    for (let radio of radios)
        if (radio.checked)
            return radio.value;
};

function addNewRow(aluno) {
    var table = document.getElementById("tableAlunos");
    var newRow = table.insertRow();

    // insert id aluno 
    createAndAppendCell(newRow, aluno.id);

    // insert name aluno 
    createAndAppendCell(newRow, aluno.name);

    // insert email aluno 
    createAndAppendCell(newRow, aluno.email, "d-none d-md-table-cell");

    // insert phone aluno 
    createAndAppendCell(newRow, aluno.phone, "d-none d-md-table-cell");

    // insert course aluno 
    for (let course of courses) {
        if (course.id == aluno.idCourse) {
            createAndAppendCell(newRow, course.name);
            break;
        }
    }

    // insert period aluno
    for (let p of periods) {
        if (p.id === aluno.period) {
            createAndAppendCell(newRow, p.name, "d-none d-md-table-cell");
            break;
        }
    }
}


function createAndAppendCell(newRow, data, className) {
    const cell = newRow.insertCell();
    cell.appendChild(document.createTextNode(data));

    if (className)
        cell.className = className;
}
