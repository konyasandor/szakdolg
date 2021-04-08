$(function(){

				$("#eredményElso").prop('disabled', true);
                $("#eredményMasod").prop('disabled', true);
                $("#eredményHarmad").prop('disabled', true);
                $("#eredményNegyed").prop('disabled', true);
                $("#eredményVastag").prop('disabled', true);
                $("#eredményVekony").prop('disabled', true);
                
                $("#elsoMeresegy").prop('disabled', false);
                $("#elsoMeresKetto").prop('disabled', false);
                $("#masodMeresegy").prop('disabled', false);
                $("#masodMeresKetto").prop('disabled', false);
                $("#harmadMeresegy").prop('disabled', false);
                $("#harmadMeresKetto").prop('disabled', false);
                $("#negyedMeresegy").prop('disabled', false);
                $("#negyedMeresKetto").prop('disabled', false);
                $("#vastagMeresegy").prop('disabled', false);
                $("#vastagMeresKetto").prop('disabled', false);
                $("#vékonyMeresegy").prop('disabled', false);
                $("#vékonyMeresKetto").prop('disabled', false);

	$('input[type="checkbox"]').click(function(){
            if($(this).prop("checked") == true){
                
                $("#elsoMeresegy").prop('disabled', true);
                $("#elsoMeresKetto").prop('disabled', true);
                $("#masodMeresegy").prop('disabled', true);
                $("#masodMeresKetto").prop('disabled', true);
                $("#harmadMeresegy").prop('disabled', true);
                $("#harmadMeresKetto").prop('disabled', true);
                $("#negyedMeresegy").prop('disabled', true);
                $("#negyedMeresKetto").prop('disabled', true);
                $("#vastagMeresegy").prop('disabled', true);
                $("#vastagMeresKetto").prop('disabled', true);
                $("#vékonyMeresegy").prop('disabled', true);
                $("#vékonyMeresKetto").prop('disabled', true);
                
                $("#eredményElso").prop('disabled', false);
                $("#eredményMasod").prop('disabled', false);
                $("#eredményHarmad").prop('disabled', false);
                $("#eredményNegyed").prop('disabled', false);
                $("#eredményVastag").prop('disabled', false);
                $("#eredményVekony").prop('disabled', false);
            }
            else if($(this).prop("checked") == false){
                
                $("#eredményElso").prop('disabled', true);
                $("#eredményMasod").prop('disabled', true);
                $("#eredményHarmad").prop('disabled', true);
                $("#eredményNegyed").prop('disabled', true);
                $("#eredményVastag").prop('disabled', true);
                $("#eredményVekony").prop('disabled', true);
                
                $("#elsoMeresegy").prop('disabled', false);
                $("#elsoMeresKetto").prop('disabled', false);
                $("#masodMeresegy").prop('disabled', false);
                $("#masodMeresKetto").prop('disabled', false);
                $("#harmadMeresegy").prop('disabled', false);
                $("#harmadMeresKetto").prop('disabled', false);
                $("#negyedMeresegy").prop('disabled', false);
                $("#negyedMeresKetto").prop('disabled', false);
                $("#vastagMeresegy").prop('disabled', false);
                $("#vastagMeresKetto").prop('disabled', false);
                $("#vékonyMeresegy").prop('disabled', false);
                $("#vékonyMeresKetto").prop('disabled', false);
            }
        });
	
	

	$("#szamolElso").on("click", function(){
		
		
		var elsoOsztalyAr =  $("#elsoOsztalyAr").text();
		var elsoMeresegy = $("#elsoMeresegy").val();
		var elsoMeresKetto = $("#elsoMeresKetto").val();
		var reszOsszeg = $("#osszAr").text();
		var brutto = "";
		
		if($('input[type="checkbox"]').prop("checked") == true){
			brutto = $("#eredményElso").val();
		}
		else
		{
			brutto = elsoMeresegy-elsoMeresKetto;
			$("#eredményElso").val(brutto);
			$("#masodMeresegy").val(elsoMeresKetto);
		}

		var netto = Math.round(brutto*0.95);
		
		$("#elsoOsztalySuly").val(netto);
		
		$("#osszAr").val(netto * parseInt(elsoOsztalyAr,10) + reszOsszeg);

	})
	
	$("#szamolMasod").on("click", function(){
	
		var masodOsztolyAr =  $("#masodOsztolyAr").text();
		var masodMeresegy = $("#masodMeresegy").val();
		var masodMeresKetto = $("#masodMeresKetto").val();
		var reszOsszeg = $("#osszAr").val();
		var brutto = "";
		
		if($('input[type="checkbox"]').prop("checked") == true){
			brutto = $("#eredményMasod").val();
		}
		else
		{
			brutto = masodMeresegy-masodMeresKetto;
			$("#eredményMasod").val(brutto);
			$("#harmadMeresegy").val(masodMeresKetto);
		}
		
		var netto = Math.round(brutto*0.95);
		
		$("#masodOsztalySuly").val(netto);
		
		$("#osszAr").val(parseInt(netto,10) * parseInt(masodOsztolyAr,10) + parseInt(reszOsszeg,10));
		
	})
	
	$("#szamolHarmad").on("click", function(){
	
		var harmadOsztalyAr =  $("#harmadOsztalyAr").text();
		var harmadMeresegy = $("#harmadMeresegy").val();
		var harmadMeresKetto = $("#harmadMeresKetto").val();
		var reszOsszeg = $("#osszAr").val();
		var brutto = "";
		
		if($('input[type="checkbox"]').prop("checked") == true){
			brutto = $("#eredményHarmad").val();
		}
		else
		{
			brutto = harmadMeresegy-harmadMeresKetto;
			$("#eredményHarmad").val(brutto);
			$("#negyedMeresegy").val(harmadMeresKetto);
		}

		var netto = Math.round(brutto*0.95);
		
		$("#harmadOsztalySuly").val(netto);

		$("#osszAr").val(parseInt(netto,10) * parseInt(harmadOsztalyAr,10) + parseInt(reszOsszeg,10));
		
		
	})
	
	$("#szamolNegyed").on("click", function(){
	
		var negyedOsztalyAr =  $("#negyedOsztalyAr").text();
		var negyedMeresegy = $("#negyedMeresegy").val();
		var negyedMeresKetto = $("#negyedMeresKetto").val();
		var reszOsszeg = $("#osszAr").val();
		var brutto = "";
		
		if($('input[type="checkbox"]').prop("checked") == true){
			brutto = $("#eredményNegyed").val();
		}
		else
		{
			brutto = negyedMeresegy-negyedMeresKetto;
			$("#eredményNegyed").val(brutto);
			$("#vastagMeresegy").val(negyedMeresKetto);
		}

		var netto = Math.round(brutto*0.95);
		
		$("#negyedOsztalySuly").val(netto);
		
		$("#osszAr").val(parseInt(netto,10) * parseInt(negyedOsztalyAr,10) + parseInt(reszOsszeg,10));
		
		
	})
	
	
	$("#szamolVastag").on("click", function(){
	
		var vastagGyokerAr =  $("#vastagGyokerAr").text();
		var vastagMeresegy = $("#vastagMeresegy").val();
		var vastagMeresKetto = $("#vastagMeresKetto").val();
		var reszOsszeg = $("#osszAr").val();
		var brutto = "";
		
		if($('input[type="checkbox"]').prop("checked") == true){
			brutto = $("#eredményVastag").val();
		}
		else
		{
			brutto = vastagMeresegy-vastagMeresKetto;
			$("#eredményVastag").val(brutto);
			$("#vékonyMeresegy").val(vastagMeresKetto);
		}

		var netto = Math.round(brutto*0.95);
		
		$("#vastagGyokerSuly").val(netto);

		$("#osszAr").val(parseInt(netto,10) * parseInt(vastagGyokerAr,10) + parseInt(reszOsszeg,10));
		
		
	})
	
	$("#szamolVekony").on("click", function(){
	
		var vekonyGyokerAr =  $("#vekonyGyokerAr").text();
		var vékonyMeresegy = $("#vékonyMeresegy").val();
		var vékonyMeresKetto = $("#vékonyMeresKetto").val();
		var reszOsszeg = $("#osszAr").val();
		var brutto = "";
		
		if($('input[type="checkbox"]').prop("checked") == true){
			brutto = $("#eredményVekony").val();
		}
		else
		{
			brutto = vékonyMeresegy-vékonyMeresKetto;
			$("#eredményVekony").val(brutto);
			
		}
		
		var netto = Math.round(brutto*0.95);
		
		$("#vekonyGyokerSuly").val(netto);
		
		$("#osszAr").val(parseInt(netto,10) * parseInt(vekonyGyokerAr,10) + parseInt(reszOsszeg,10));
		
		
	})

	$(".numberFormat").keypress(function (e) {
     //if the letter is not digit then display error and don't type anything
     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
        //display error message
        $("#errmsg").html("Csak szám!").show().fadeOut("slow");
               return false;
    }
   });
   
  //******************************************************* Ugyfel szerkesztés modal ************************************************************//
   
   $('#ugyfelTable').on('click','.editUser', function() {
    
    	var row = $(this).closest("tr");
    	var id = row.find("td:eq(0)").text();

        var href = 'editugyfel/?id='+id;
      
      		

            $.get(href, function (users) {
            	
                $('.myForm #termeloId').val(users.id);
                $('.myForm #termeloNev').val(users.termeloNev);
                $('.myForm #termeloLnev').val(users.termeloLnev);
                $('.myForm #termeloCim').val(users.termeloCim);
                $('.myForm #termeloSzuletesiHely').val(users.termeloSzuletesiHely);
                var dateValue = users.termeloSzuletesiIdo.split(/[- T :]/);
                var formatDate = new Date(Date.UTC(dateValue[0], dateValue[1]-1, dateValue[2]));
                month = '' + (formatDate.getMonth() + 1),
        		day = '' + formatDate.getDate(),
        		year = formatDate.getFullYear();
        		if (month.length < 2) month = '0' + month;
    			if (day.length < 2) day = '0' + day;
    			var szuletesiDatum = [year, month, day].join('-');
                $('.myForm #termeloSzuletesiIdo').val(szuletesiDatum);
                $('.myForm #termeloEdesAnyjaNeve').val(users.termeloEdesAnyjaNeve);
                $('.myForm #termeloTelefonSzam').val(users.termeloTelefonSzam);
                $('.myForm #termeloTajSzam').val(users.termeloTajSzam);
                $('.myForm #termeloOstermeloiIgazolvanySzam').val(users.termeloOstermeloiIgazolvanySzam);
                var dateValue = users.termeloOstermeloiIgazolvanyErvenyesseg.split(/[- T :]/);
                var formatDate2 = new Date(Date.UTC(dateValue[0], dateValue[1]-1, dateValue[2]));
                month = '' + (formatDate2.getMonth() + 1),
        		day = '' + formatDate2.getDate(),
        		year = formatDate2.getFullYear();
        		if (month.length < 2) month = '0' + month;
    			if (day.length < 2) day = '0' + day;
    			var ervenyessegiDatum = [year, month, day].join('-');
                $('.myForm #termeloOstermeloiIgazolvanyErvenyesseg').val(ervenyessegiDatum);
                $('.myForm #termeloAdoazonositoJel').val(users.termeloAdoazonositoJel);
                $('.myForm #termeloAdoSzam').val(users.termeloAdoSzam);
                $('.myForm #termeloCsaladiGazdasagSzam').val(users.termeloCsaladiGazdasagSzam);
                $('.myForm #termeloGlobalGapSzam').val(users.termeloGlobalGapSzam);
                $('.myForm #termeloBankszamlaSzam').val(users.termeloBankszamlaSzam);
                
            });
            $('.myForm #updateModal').modal('show');
        
    });
    
    
    
    $('.nBtn').on('click', function(event) {
    	
    	$('.myFormNew #newModal').modal('show');
    });
    
    //**************************************************************Kereső szűrés***********************************************************************//
    
    $('#txtSearch').on('keyup', function(){
    	
    	var input, filter, table, tr, td, i, txtValue;
    	table = $('#filteredTable');
    	tr = $('#filteredTable tr');
    	
    	input = $(this).val().toUpperCase();
    
    	for(i = 0; i < tr.length; i++){
    		td = tr[i].getElementsByTagName("td")[0];
    		if (td) {
      			txtValue = td.textContent || td.innerText;
      			
      			if (txtValue.toUpperCase().indexOf(input) > -1) {
        			tr[i].style.display = "";
      			} else {
        			tr[i].style.display = "none";
      			}
    		}
    	}
    
    });
    
    
    //*************************************************************mérlegjegy modal*********************************************************************//
    
   
    $('#merlegjegyTable').on('click','.newMerleg', function() {
    
    	var row = $(this).closest("tr");
    	var id = row.find("td:eq(0)").text();

        var href = 'ujmerlegjegy/?id='+id;
       
      		

            $.get(href, function (users) {
            	$('.newMerlegJegy #termeloId').val(users.id);
                $('.newMerlegJegy #termeloNev').val(users.termeloNev);
            
            });
    	
    	$('.newMerlegJegy #newMerlegModal').modal('show');
    });
    
    
    
    //**************************************************************Felvásárlási jegy szűrés***********************************************************************//
    
    $('#merlegjegySearch').on('keyup', function(){
    	
    	var input, filter, table, tr, td, i, txtValue;
    	table = $('#filteredMerlegjegyTable');
    	tr = $('#filteredMerlegjegyTable tr');
    	
    	input = $(this).val().toUpperCase();
    
    	for(i = 0; i < tr.length; i++){
    		td = tr[i].getElementsByTagName("td")[1];
    		if (td) {
      			txtValue = td.textContent || td.innerText;
      			
      			if (txtValue.toUpperCase().indexOf(input) > -1) {
        			tr[i].style.display = "";
      			} else {
        			tr[i].style.display = "none";
      			}
    		}
    	}
    
    });
    
    //***************************************************************Felvásárlási jegy összeadás*****************************************************************//
    
    $('#sumButton').on('click', function(){
    	var checkBoxList = [];
    	var tr = $('#filteredMerlegjegyTable tr'); 
    	
    	for(i = 0; i < tr.lenght; i++){
    		cb = tr[i].getElementsByTagName("checkbox");
    		if(cb.val()){
    		console.log(cb);
    		}
    	}
    
    });
    
    
            
        
})

