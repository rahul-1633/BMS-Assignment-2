var State = new Array;

State['India'] = new Array('Select', 'Punjab', 'Haryana', 'UP');
State['USA'] = new Array('Select', 'Washington DC', 'NewYork', 'London');

var City = new Array;

City['India'] = new Array();
City['India']['Punjab'] = new Array('Select', 'Amritsar', 'Moga', 'Jalandhar');
City['India']['Haryana'] = new Array('Select', 'Sonipat', 'Panipat', 'Karnal');
City['India']['UP'] = new Array('Select', 'Lucknow', 'Kanpur', 'Ghaziabad');

City['USA'] = new Array();
City['USA']['Washington DC'] = new Array('Select', 'Covington', 'Arlington', 'Olympia');
City['USA']['NewYork'] = new Array('Select', 'Albany', 'Ithaca', 'Niagra Falls');
City['USA']['London'] = new Array('Select', 'Bedford', 'Adilade', 'Sidmouth');

function setStates() {

	contrySet = document.getElementById('Country');
	StateList = State[contrySet.value];
	changeSelect('State', StateList, StateList);
	setCity();
}

function setCity() {

	contrySet = document.getElementById('Country');
	stateSet = document.getElementById('State');
	CityList = City[contrySet.value][stateSet.value];
	changeSelect('City', CityList, CityList);
}

function changeSelect(fieldId, newOptions, newValues) {

	selectField = document.getElementById(fieldId);
	selectField.options.length = 0;
	for (i = 0; i < newOptions.length; i++) {
		selectField.options[selectField.length] = new Option(newOptions[i], newValues[i]);
	}
}
