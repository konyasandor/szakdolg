$(function(){

	$("#szamolElso").on("click", function(){
	
		var elsoOsztalyAr =  $("#elsoOsztalyAr").text();
		var elsoMeresegy = $("#elsoMeresegy").val();
		var elsoMeresKetto = $("#elsoMeresKetto").val();
		var reszOsszeg = $("#osszAr").text();
		
		var brutto = elsoMeresegy-elsoMeresKetto;
		 
		$("#eredményElso").text(brutto);
		
		$("#masodMeresegy").val(elsoMeresKetto);
		
		var netto = brutto*0.95;
		
		$("#elsoOsztalySuly").val(netto);
		
		$("#osszAr").val(netto * parseInt(elsoOsztalyAr,10) + reszOsszeg);
		
		
	})
	
	$("#szamolMasod").on("click", function(){
	
		var masodOsztolyAr =  $("#masodOsztolyAr").text();
		var masodMeresegy = $("#masodMeresegy").val();
		var masodMeresKetto = $("#masodMeresKetto").val();
		var reszOsszeg = $("#osszAr").val();
		
		var brutto = masodMeresegy-masodMeresKetto;
		 
		$("#eredményMasod").text(brutto);
		
		$("#harmadMeresegy").val(masodMeresKetto);
		
		var netto = brutto*0.95;
		
		$("#masodOsztalySuly").val(netto);
		
		
		
		$("#osszAr").val(parseInt(netto,10) * parseInt(masodOsztolyAr,10) + parseInt(reszOsszeg,10));
		
		
	})
	
	$("#szamolHarmad").on("click", function(){
	
		var harmadOsztalyAr =  $("#harmadOsztalyAr").text();
		var harmadMeresegy = $("#harmadMeresegy").val();
		var harmadMeresKetto = $("#harmadMeresKetto").val();
		var reszOsszeg = $("#osszAr").val();
		
		var brutto = harmadMeresegy-harmadMeresKetto;
		 
		$("#eredményHarmad").text(brutto);
		
		$("#negyedMeresegy").val(harmadMeresKetto);
		
		var netto = brutto*0.95;
		
		$("#harmadOsztalySuly").val(netto);
		
		
		
		$("#osszAr").val(parseInt(netto,10) * parseInt(harmadOsztalyAr,10) + parseInt(reszOsszeg,10));
		
		
	})
	
	$("#szamolNegyed").on("click", function(){
	
		var negyedOsztalyAr =  $("#negyedOsztalyAr").text();
		var negyedMeresegy = $("#negyedMeresegy").val();
		var negyedMeresKetto = $("#negyedMeresKetto").val();
		var reszOsszeg = $("#osszAr").val();
		
		var brutto = negyedMeresegy-negyedMeresKetto;
		 
		$("#eredményNegyed").text(brutto);
		
		$("#vastagMeresegy").val(negyedMeresKetto);
		
		var netto = brutto*0.95;
		
		$("#negyedOsztalySuly").val(netto);
		
		
		
		$("#osszAr").val(parseInt(netto,10) * parseInt(negyedOsztalyAr,10) + parseInt(reszOsszeg,10));
		
		
	})
	
	
	$("#szamolVastag").on("click", function(){
	
		var vastagGyokerAr =  $("#vastagGyokerAr").text();
		var vastagMeresegy = $("#vastagMeresegy").val();
		var vastagMeresKetto = $("#vastagMeresKetto").val();
		var reszOsszeg = $("#osszAr").val();
		
		var brutto = vastagMeresegy-vastagMeresKetto;
		 
		$("#eredményVastag").text(brutto);
		
		$("#vékonyMeresegy").val(vastagMeresKetto);
		
		var netto = brutto*0.95;
		
		$("#vastagGyokerSuly").val(netto);
		
		
		
		$("#osszAr").val(parseInt(netto,10) * parseInt(vastagGyokerAr,10) + parseInt(reszOsszeg,10));
		
		
	})
	
	$("#szamolVekony").on("click", function(){
	
		var vekonyGyokerAr =  $("#vekonyGyokerAr").text();
		var vékonyMeresegy = $("#vékonyMeresegy").val();
		var vékonyMeresKetto = $("#vékonyMeresKetto").val();
		var reszOsszeg = $("#osszAr").val();
		
		var brutto = vékonyMeresegy-vékonyMeresKetto;
		 
		$("#eredményVekony").text(brutto);
		
		var netto = brutto*0.95;
		
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
})

