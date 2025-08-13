var names = ["Pooji", "Ashok", "Sahasra", "Bhanu", "Tharun", "Abhay", "Janu"];


var filteredNames = names
    .filter(function(name) {
        return name.length > 5;
    })
    .map(function(name) {
        return name.toUpperCase();
    });

var listElement = document.getElementById("nameList");
filteredNames.forEach(function(name) {
    var li = document.createElement("li");
    li.textContent = name;
    listElement.appendChild(li);
});

console.log(filteredNames); 
