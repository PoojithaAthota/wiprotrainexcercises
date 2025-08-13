let cities = ["Hyderabad", "Mumbai", "Delhi", "Bangalore", "Chennai"];

function loadCities() {
    let cityList = document.getElementById("cityList");
    cityList.innerHTML = ""; 

    
    let sortedCities = [...cities].sort();

    sortedCities.forEach(city => {
        let li = document.createElement("li");
        li.textContent = city + " ";

        
        let delBtn = document.createElement("button");
        delBtn.textContent = "Delete";
        delBtn.onclick = function () {
            cities = cities.filter(c => c !== city); 
            loadCities(); 
        };

        li.appendChild(delBtn);
        cityList.appendChild(li);
    });
}
