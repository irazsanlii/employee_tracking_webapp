function openTable(evt, tableName) {
var i, x, tablinks;
x = document.getElementsByClassName("projects-teams");
for (i = 0; i < x.length; i++) {
x[i].style.display = "none";
}
tablinks = document.getElementsByClassName("tablink");
for (i = 0; i < x.length; i++) {
tablinks[i].className = tablinks[i].className.replace(" w3-dark-grey", "");
}
document.getElementById(tableName).style.display = "block";
evt.currentTarget.className += " w3-dark-grey";
}