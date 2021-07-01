function validar_registrohabi() {
	
	var categoria = document.getElementById('idcategoria').value;
	var estado = document.getElementById('idestado').value;
	var nivel = document.getElementById('idnivel').value;

	
	
	if (categoria === "" || estado === "" || nivel === "" ){
		
		if (estado === "") {

			$("#errorestadio").text("Es obligatorio seleccionar un estado");
		}
		else{
			$("#errorestadio").text("");
		}

		if (nivel === "") {

			$("#errornivel").text("Es obligatorio seleccionar un nivel");
		}
		else{
			$("#errornivel").text("");
		}
		

		if (categoria === "" ) {

			$("#errorcatego").text("Es obligatorio seleccionar una categoria");
		}
		else{
			$("#errorcatego").text("");
		}

	
		return false;
	}
	
	
	
}

