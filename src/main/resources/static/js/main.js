$(function(){

	
	$('#elsoOsztEgysegAr').focusout(function(){
	
		var levonas = ((100-$('#elsoOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#elsoOsztBruttoSuly').val()*levonas,10);
	
		$('#elsoOsztalyNettoSuly').val(netto);
		
		$('#elsoOsztalyErteke').val(netto*$('#elsoOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
	});
				
	$('#elsoOsztBruttoSuly').focusout(function(){
	
		var levonas = ((100-$('#elsoOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#elsoOsztBruttoSuly').val()*levonas,10);
	
		$('#elsoOsztalyNettoSuly').val(netto);
		
		$('#elsoOsztalyErteke').val(netto*$('#elsoOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
		
		$('#masodOsztBruttoSuly').focus();
	});
	
	
	$('#elsoOsztLevonas').focusout(function(){
	
		var levonas = ((100-$('#elsoOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#elsoOsztBruttoSuly').val()*levonas,10);
	
		$('#elsoOsztalyNettoSuly').val(netto);
		
		$('#elsoOsztalyErteke').val(netto*$('#elsoOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
	});
	
	$('#masodOsztEgysegAr').focusout(function(){
	
		var levonas = ((100-$('#masodOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#masodOsztBruttoSuly').val()*levonas,10);
	
		$('#masodOsztalyNettoSuly').val(netto);
		
		$('#masodOsztalyErteke').val(netto*$('#masodOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
	});
				
	$('#masodOsztBruttoSuly').focusout(function(){
	
		var levonas = ((100-$('#masodOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#masodOsztBruttoSuly').val()*levonas,10);
	
		$('#masodOsztalyNettoSuly').val(netto);
		
		$('#masodOsztalyErteke').val(netto*$('#masodOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
		
		$('#harmadOsztBruttoSuly').focus();
	});
	
	$('#masodOsztLevonas').focusout(function(){
	
		var levonas = ((100-$('#masodOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#masodOsztBruttoSuly').val()*levonas,10);
	
		$('#masodOsztalyNettoSuly').val(netto);
		
		$('#masodOsztalyErteke').val(netto*$('#masodOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
	});
	
	$('#harmadOsztEgysegAr').focusout(function(){
	
		var levonas = ((100-$('#harmadOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#harmadOsztBruttoSuly').val()*levonas,10);
	
		$('#harmadOsztalyNettoSuly').val(netto);
		
		$('#harmadOsztalyErteke').val(netto*$('#harmadOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
	});
				
	$('#harmadOsztBruttoSuly').focusout(function(){
	
		var levonas = ((100-$('#harmadOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#harmadOsztBruttoSuly').val()*levonas,10);
	
		$('#harmadOsztalyNettoSuly').val(netto);
		
		$('#harmadOsztalyErteke').val(netto*$('#harmadOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
		
		$('#negyedOsztBruttoSuly').focus();
	});
	
	$('#harmadOsztLevonas').focusout(function(){
	
		var levonas = ((100-$('#harmadOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#harmadOsztBruttoSuly').val()*levonas,10);
	
		$('#harmadOsztalyNettoSuly').val(netto);
		
		$('#harmadOsztalyErteke').val(netto*$('#harmadOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
	});
	
	$('#negyedOsztEgysegAr').focusout(function(){
	
		var levonas = ((100-$('#negyedOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#negyedOsztBruttoSuly').val()*levonas,10);
	
		$('#negyedOsztalyNettoSuly').val(netto);
		
		$('#negyedOsztalyErteke').val(netto*$('#negyedOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
	});
				
	$('#negyedOsztBruttoSuly').focusout(function(){
	
		var levonas = ((100-$('#negyedOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#negyedOsztBruttoSuly').val()*levonas,10);
	
		$('#negyedOsztalyNettoSuly').val(netto);
		
		$('#negyedOsztalyErteke').val(netto*$('#negyedOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
		
		$('#vastagBruttoSuly').focus();
	});
	
	$('#negyedOsztLevonas').focusout(function(){
	
		var levonas = ((100-$('#negyedOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#negyedOsztBruttoSuly').val()*levonas,10);
	
		$('#negyedOsztalyNettoSuly').val(netto);
		
		$('#negyedOsztalyErteke').val(netto*$('#negyedOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
	});
	
	$('#vastagEgysegAr').focusout(function(){
	
		var levonas = ((100-$('#vastagLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#vastagBruttoSuly').val()*levonas,10);
	
		$('#vastagNettoSuly').val(netto);
		
		$('#vastagErteke').val(netto*$('#vastagEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
	});
				
	$('#vastagBruttoSuly').focusout(function(){
	
		var levonas = ((100-$('#vastagLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#vastagBruttoSuly').val()*levonas,10);
	
		$('#vastagNettoSuly').val(netto);
		
		$('#vastagErteke').val(netto*$('#vastagEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
		
		$('#vekonyBruttoSuly').focus();
	});
	
	$('#vastagLevonas').focusout(function(){
	
		var levonas = ((100-$('#vastagLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#vastagNettoSuly').val()*levonas,10);
	
		$('#vastagNettoSuly').val(netto);
		
		$('#vastagErteke').val(netto*$('#vastagEgysegAr').val());

		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
	});
	
	$('#vekonyEgysegAr').focusout(function(){
	
		var levonas = ((100-$('#vekonyLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#vekonyBruttoSuly').val()*levonas,10);
	
		$('#vekonyNettoSuly').val(netto);
		
		$('#vekonyErteke').val(netto*$('#vekonyEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
	});
				
	$('#vekonyBruttoSuly').focusout(function(){
	
		var levonas = ((100-$('#vekonyLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#vekonyBruttoSuly').val()*levonas,10);
	
		$('#vekonyNettoSuly').val(netto);
		
		$('#vekonyErteke').val(netto*$('#vekonyEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
		
		$('#leadasDatum').focus();
	});
	
	$('#vekonyLevonas').focusout(function(){
	
		var levonas = ((100-$('#vekonyLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#vekonyBruttoSuly').val()*levonas,10);
	
		$('#vekonyNettoSuly').val(netto);
		
		$('#vekonyErteke').val(netto*$('#vekonyEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').inputmask("setvalue",$('#elsoOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#masodOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#harmadOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#negyedOsztalyErteke').inputmask("unmaskedvalue")*1 + $('#vastagErteke').inputmask("unmaskedvalue")*1 + $('#vekonyErteke').inputmask("unmaskedvalue")*1);
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
	});
	
	$('#eloleg').focusout(function(){
	
		
	
		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue") - $('#eloleg').inputmask("unmaskedvalue"));
		
		});
		
	$('#osszAr').focusout(function(){
	

		$('#fizetendő').inputmask("setvalue",$('#osszAr').inputmask("unmaskedvalue"));
		
		});
		
	$('#osszArV').focusout(function(){
	

		$('#fizetendőV').inputmask("setvalue",$('#osszArV').inputmask("unmaskedvalue"));
		
		});
	
	$('#elsoOsztalyNettoSuly').focusout(function(){
	
		
	
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
	});
	
	$('#masodOsztalyNettoSuly').focusout(function(){
	
		
	
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
	});
	
	$('#harmadOsztalyNettoSuly').focusout(function(){
	
		
	
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
	});
	
	$('#negyedOsztalyNettoSuly').focusout(function(){
	
		
	
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
	});
	
	$('#vastagNettoSuly').focusout(function(){
	
		
	
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
	});
	
	$('#vekonyNettoSuly').focusout(function(){
	
		
	
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
	});
	
	

  //****************************************************** Number format ************************************************************************//

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
                $('#termeloTelefonSzam').inputmask({"mask": "(99) 999-9999"});
                $('.myForm #termeloTajSzam').val(users.termeloTajSzam);
                $('#termeloTajSzam').inputmask({"mask": "999-999-999"});
                $('.myForm #termeloOstermeloiIgazolvanySzam').val(users.termeloOstermeloiIgazolvanySzam);
                $('#termeloOstermeloiIgazolvanySzam').inputmask({"mask": "AA9999999"});
                $('.myForm #termeloAdoazonositoJel').val(users.termeloAdoazonositoJel);
                $('#termeloAdoazonositoJel').inputmask({"mask": "9999999999"});
                $('.myForm #termeloAdoSzam').val(users.termeloAdoSzam);
                $('#termeloAdoSzam').inputmask({"mask": "99999999-9-99"});
                $('.myForm #termeloCsaladiGazdasagSzam').val(users.termeloCsaladiGazdasagSzam);
                $('#termeloCsaladiGazdasagSzam').inputmask({"mask": "AAAA-99999999"});
                $('.myForm #termeloGlobalGapSzam').val(users.termeloGlobalGapSzam);
                $('#termeloGlobalGapSzam').inputmask({"mask": "AAA-9999999999999"});
                $('.myForm #termeloBankszamlaSzam').val(users.termeloBankszamlaSzam);
                $('#termeloBankszamlaSzam').inputmask({"mask": "99999999-99999999-99999999"});
                
            });
            $('.myForm #updateModal').modal('show');
        
    });
    
    $('#updateModal').on('hidden.bs.modal', function() {
    	
    	
    	$('.modal-body').each(function(){
    		$(this).find(':input').val("");
    	});
    
    });
    
    $('.nBtn').on('click', function(event) {
    	
    	$('.myFormNew #newModal').modal('show');
    });
    
    $('#ugyfelTable').on('click','.deleteUser', function() {
    
    	var row = $(this).closest("tr");
    	var id = row.find("td:eq(0)").text();
    	var name = row.find("td:eq(1)").text();
    
    	console.log(name);
    	$('#modalDelete').modal('show');
    	
    	$('#askName').text("Biztosan törlöd a " + name + " felhasználót?");
    	
	    	$('#deleteUserBtn').on('click', function(event) {
	    	
	    	
	    	
	    	var href = 'deletetermelo/?id='+id;
	    	
	    	$.ajax({
		        type : "DELETE",
		        url : 'deletetermelo/?id='+id,
		        data: {id : id},
		        contentType: "application/json",
		        dataType : 'json',
		        success: function (result) {       
		               console.log(result);                
		        },
		        error: function (e) {
		            console.log(e);
		        }
		   }) 
		   
		   location.reload(); 
	    });
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
    
    	const d = new Date();
		var year = d.getFullYear();
		var month = d.getMonth();
		var day = d.getDate();
    
    	var row = $(this).closest("tr");
    	var id = row.find("td:eq(0)").text();

        var href = 'ujmerlegjegy/?id='+id;
        
        
        $('#elsoOsztEgysegAr').val($('#elsoOsztalyAr').text());
        $('#masodOsztEgysegAr').val($('#masodOsztolyAr').text());
        $('#harmadOsztEgysegAr').val($('#harmadOsztalyAr').text());
        $('#negyedOsztEgysegAr').val($('#negyedOsztalyAr').text());
        $('#vastagEgysegAr').val($('#vastagGyokerAr').text());
        $('#vekonyEgysegAr').val($('#vekonyGyokerAr').text());
       
      		

            $.get(href, function (users) {
            	$('.newMerlegJegy #termeloId').val(users.id);
                $('.newMerlegJegy #termeloNev').val(users.termeloNev);
                $('.newMerlegJegy #termeloLnev').text(users.termeloLnev);
                $('.newMerlegJegy #termeloCim').text(users.termeloCim);
                $('.newMerlegJegy #termeloOstermeloiIgazolvanySzam').text(users.termeloOstermeloiIgazolvanySzam);
                
                $('.newMerlegJegy #termeloAdoazonositoJel').text(users.termeloAdoazonositoJel);
                $('.newMerlegJegy #termeloAdoSzam').text(users.termeloAdoSzam);
                $('.newMerlegJegy #termeloSzuletesiHely').text(users.termeloSzuletesiHely);
                var dateValue = users.termeloSzuletesiIdo.split(/[- T :]/);
                var formatDate2 = new Date(Date.UTC(dateValue[0], dateValue[1]-1, dateValue[2]));
                month = '' + (formatDate2.getMonth() + 1),
        		day = '' + formatDate2.getDate(),
        		year = formatDate2.getFullYear();
        		if (month.length < 2) month = '0' + month;
    			if (day.length < 2) day = '0' + day;
    			var szuletesiDatum2 = [year, month, day].join('-');
                $('.newMerlegJegy #termeloSzuletesiIdo').text(szuletesiDatum2);
                $('.newMerlegJegy #termeloEdesAnyjaNeve').text(users.termeloEdesAnyjaNeve);
                $('.newMerlegJegy #termeloTajSzam').text(users.termeloTajSzam);
                $('.newMerlegJegy #termeloCsaladiGazdasagSzam').text(users.termeloCsaladiGazdasagSzam);
                $('.newMerlegJegy #termeloGlobalGapSzam').text(users.termeloGlobalGapSzam);
                $('.newMerlegJegy #termeloTelefonSzam').text(users.termeloTelefonSzam);
                $('.newMerlegJegy #termeloBankszamlaSzam').text(users.termeloBankszamlaSzam);
            
            });
            
        $('#leadasDatum').val(year + '/' + month + '/' + day);   
    	
    	$('.newMerlegJegy #newMerlegModal').modal('show');
    });
    
    $('#newMerlegModal').on('hidden.bs.modal', function() {
    	
    	$('#elsoOsztEgysegAr').val($('#elsoOsztalyAr').text());
        $('#masodOsztEgysegAr').val($('#masodOsztolyAr').text());
        $('#harmadOsztEgysegAr').val($('#harmadOsztalyAr').text());
        $('#negyedOsztEgysegAr').val($('#negyedOsztalyAr').text());
        $('#vastagEgysegAr').val($('#vastagGyokerAr').text());
        $('#vekonyEgysegAr').val($('#vekonyGyokerAr').text());
        
    	$('.suly').val(0);
    	$('#osszSuly').text(0);
    	$('.levonas').val(5);
    	$('.osszeg').val(0);
    	$('#leadasDatum').val(0);
    
    });
    
      //******************************************************* Mérlegjegy szerkesztés modal ************************************************************//
   
   $('#merlegjegyLista').on('click','.editMerlegjegy', function() {
    
    	var row = $(this).closest("tr");
    	var id = row.find("td:eq(1)").text();

        var href = 'getmerlegjegy/?id='+id;
        
          var userId = 0;
      
      		

            $.get(href, function (merlegjegy) {
            	
                
               
               if(!merlegjegy.vevo){
               
               		$('.editMJegy #editMerlegJegy').modal('show');
					$('.editMJegy #mId').val(id);
               		$('.editMJegy #termeloId').val(merlegjegy.tId);
                    $('.editMJegy #termeloNev').val(merlegjegy.tNev);
                    
                    $('.editMJegy #elsoOsztEgysegAr').val(merlegjegy.elsoOsztEgysegAr);
                    $('.editMJegy #elsoOsztLevonas').val(merlegjegy.elsoOsztLevonas);
                    $('.editMJegy #elsoOsztalyNettoSuly').val(merlegjegy.elsoOsztalySuly);
                    $('.editMJegy #elsoOsztalyErteke').val(merlegjegy.elsoOsztalyErteke);
                    $('.editMJegy #elsoOsztBruttoSuly').val((merlegjegy.elsoOsztalySuly/95)*100);
                    
                    $('.editMJegy #masodOsztEgysegAr').val(merlegjegy.masodOsztEgysegAr);
                    $('.editMJegy #masodOsztLevonas').val(merlegjegy.masodOsztLevonas);
                    $('.editMJegy #masodOsztalyNettoSuly').val(merlegjegy.masodOsztalySuly);
                    $('.editMJegy #masodOsztalyErteke').val(merlegjegy.masodOsztalyErteke);
                    $('.editMJegy #masodOsztBruttoSuly').val((merlegjegy.masodOsztalySuly/95)*100);
                    
                    $('.editMJegy #harmadOsztEgysegAr').val(merlegjegy.harmadOsztEgysegAr);
                    $('.editMJegy #harmadOsztLevonas').val(merlegjegy.harmadOsztLevonas);
                    $('.editMJegy #harmadOsztalyNettoSuly').val(merlegjegy.harmadOsztalySuly);
                    $('.editMJegy #harmadOsztalyErteke').val(merlegjegy.harmadOsztalyErteke);
                    $('.editMJegy #harmadOsztBruttoSuly').val((merlegjegy.harmadOsztalySuly/95)*100);
                    
                    $('.editMJegy #negyedOsztEgysegAr').val(merlegjegy.negyedOsztEgysegAr);
                    $('.editMJegy #negyedOsztLevonas').val(merlegjegy.negyedOsztLevonas);
                    $('.editMJegy #negyedOsztalyNettoSuly').val(merlegjegy.negyedOsztalySuly);
                    $('.editMJegy #negyedOsztalyErteke').val(merlegjegy.negyedOsztalyErteke);
                    $('.editMJegy #negyedOsztBruttoSuly').val((merlegjegy.negyedOsztalySuly/95)*100);
                    
                    $('.editMJegy #vastagEgysegAr').val(merlegjegy.vastagEgysegAr);
                    $('.editMJegy #vastagLevonas').val(merlegjegy.vastagLevonas);
                    $('.editMJegy #vastagNettoSuly').val(merlegjegy.vastagGyokerSuly);
                    $('.editMJegy #vastagErteke').val(merlegjegy.vastagErteke);
                    $('.editMJegy #vastagBruttoSuly').val((merlegjegy.vastagGyokerSuly/95)*100);
                    
                    $('.editMJegy #vekonyEgysegAr').val(merlegjegy.vekonyEgysegAr);
                    $('.editMJegy #vekonyLevonas').val(merlegjegy.vekonyLevonas);
                    $('.editMJegy #vekonyNettoSuly').val(merlegjegy.vekonyGyokerSuly);
                    $('.editMJegy #vekonyErteke').val(merlegjegy.vekonyErteke);
                    $('.editMJegy #vekonyBruttoSuly').val((merlegjegy.vekonyGyokerSuly/95)*100);
                    
                    var dateValue = merlegjegy.leadasDatum.split(/[- T :]/);
	                var formatDate = new Date(Date.UTC(dateValue[0], dateValue[1]-1, dateValue[2]));
	                month = '' + (formatDate.getMonth() + 1),
	        		day = '' + formatDate.getDate(),
	        		year = formatDate.getFullYear();
	        		if (month.length < 2) month = '0' + month;
	    			if (day.length < 2) day = '0' + day;
	    			var leadDatum = [year, month, day].join('-');
	                $('.editMJegy #leadasDatum').val(leadDatum);
	                
	                $('.editMJegy #osszAr').val(merlegjegy.osszAr);
                    $('.editMJegy #eloleg').val(merlegjegy.eloleg);
                    
                    $('.editMJegy #fizetendő').val(merlegjegy.kifizetendo);
               }
               else{
               		$('.editMJegyVevo #editMerlegJegyVevo').modal('show');
					
					$('.editMJegyVevo #mId').val(id);
               		$('.editMJegyVevo #termeloId').val(merlegjegy.tId);
                    $('.editMJegyVevo #termeloNev').val(merlegjegy.tNev);
                    $('.editMJegyVevo #elsoOsztalyNettoSuly').val(merlegjegy.elsoOsztalySuly);
                    $('.editMJegyVevo #masodOsztalyNettoSuly').val(merlegjegy.masodOsztalySuly);
                    $('.editMJegyVevo #harmadOsztalyNettoSuly').val(merlegjegy.harmadOsztalySuly);
                    $('.editMJegyVevo #negyedOsztalyNettoSuly').val(merlegjegy.negyedOsztalySuly);
                    $('.editMJegyVevo #vastagNettoSuly').val(merlegjegy.vastagGyokerSuly);
                    $('.editMJegyVevo #vekonyNettoSuly').val(merlegjegy.vekonyGyokerSuly);
                    $('.editMJegyVevo #penznem').val(merlegjegy.penznem);
                    $('.editMJegyVevo #osszArV').val(merlegjegy.osszAr);
                    $('.editMJegyVevo #eloleg').val(merlegjegy.eloleg);
                    $('.editMJegyVevo #szamlaSorszam').val(merlegjegy.szamlaSorszam);
                    $('.editMJegyVevo #fizetendőV').val(merlegjegy.kifizetendo);
                    var dateValue = merlegjegy.leadasDatum.split(/[- T :]/);
	                var formatDate = new Date(Date.UTC(dateValue[0], dateValue[1]-1, dateValue[2]));
	                month = '' + (formatDate.getMonth() + 1),
	        		day = '' + formatDate.getDate(),
	        		year = formatDate.getFullYear();
	        		if (month.length < 2) month = '0' + month;
	    			if (day.length < 2) day = '0' + day;
	    			var leadDatum = [year, month, day].join('-');
	                $('.editMJegyVevo #leadasDatum').val(leadDatum);
	                
	                var dateValue1 = merlegjegy.fizetesiHatarido.split(/[- T :]/);
	                var formatDate1 = new Date(Date.UTC(dateValue1[0], dateValue1[1]-1, dateValue1[2]));
	                month = '' + (formatDate1.getMonth() + 1),
	        		day = '' + formatDate1.getDate(),
	        		year = formatDate1.getFullYear();
	        		if (month.length < 2) month = '0' + month;
	    			if (day.length < 2) day = '0' + day;
	    			var leadDatum1 = [year, month, day].join('-');
	                $('.editMJegyVevo #fizetesiHatarido').val(leadDatum1);
	                
	                var dateValue2 = merlegjegy.kifizetesDatum.split(/[- T :]/);
	                var formatDate2 = new Date(Date.UTC(dateValue2[0], dateValue2[1]-1, dateValue2[2]));
	                month = '' + (formatDate2.getMonth() + 1),
	        		day = '' + formatDate2.getDate(),
	        		year = formatDate2.getFullYear();
	        		if (month.length < 2) month = '0' + month;
	    			if (day.length < 2) day = '0' + day;
	    			var leadDatum2 = [year, month, day].join('-');
	                $('.editMJegyVevo #kifizetesDatum').val(leadDatum2);
               }
                
            })
            
           
        
    });
    
    $('#editMerlegJegy').on('hidden.bs.modal', function() {
    	
    	$('#elsoOsztEgysegAr').val($('#elsoOsztalyAr').text());
        $('#masodOsztEgysegAr').val($('#masodOsztolyAr').text());
        $('#harmadOsztEgysegAr').val($('#harmadOsztalyAr').text());
        $('#negyedOsztEgysegAr').val($('#negyedOsztalyAr').text());
        $('#vastagEgysegAr').val($('#vastagGyokerAr').text());
        $('#vekonyEgysegAr').val($('#vekonyGyokerAr').text());
        
    	$('.suly').val(0);
    	$('#osszSuly').text(0);
    	$('.levonas').val(5);
    	$('.osszeg').val(0);
    	$('#leadasDatum').val(0);
    
    });
    
    $('#merlegjegyLista').on('click','.deleteMerlegjegy', function() {
    
    	var row = $(this).closest("tr");
    	var id = row.find("td:eq(1)").text();
    	var name = row.find("td:eq(2)").text();
    	
    	console.log(id);
    	$('#modalDeleteMerlegjegy').modal('show');
    	
    	$('#ask').text("Biztosan törlöd a " + name + " sorszámú mérlegjegyet?");
    	
	    	$('#deleteMerlegBtn').on('click', function(event) {
	    	
	    	
	    	
	    	var href = 'deletemerlegjegy/?id='+id;
	    	
	    	$.ajax({
		        type : "DELETE",
		        url : 'deletemerlegjegy/?id='+id,
		        data: {id : id},
		        contentType: "application/json",
		        dataType : 'json',
		        success: function (result) {       
		               console.log(result);                
		        },
		        error: function (e) {
		            console.log(e);
		        }
		   }) 
		   
		   location.reload(); 
	    });
    });
    //*************************************************************vevő mérlegjegy lista datum set***********************************************************//
    $('#vevomerlegjegyLista').on('click','.modifyvevomjegy', function() {
    
    	var row = $(this).closest("tr");
    	var id = row.find("td:eq(0)").text();
    	var href = 'getmerlegjegy/?id='+id;
    	
    	console.log(id);
    	
    			$.get(href, function (merlegjegy) { 
    				$('.ackmjegy #mId').val(id);
    				$('.ackmjegy #szamlaSorszam').val(merlegjegy.szamlaSorszam);
    				$('#modalAckMerlegjegy').modal('show');
    			});
    	

    	
	    	
    });
    //*************************************************************vevő mérlegjegy modal*********************************************************************//
    
   
    $('#vevoMerlegjegyTable').on('click','.newVevoMerleg', function() {
    
    	const d = new Date();
		var year = d.getFullYear();
		var month = d.getMonth();
		var day = d.getDate();
    
    	var row = $(this).closest("tr");
    	var id = row.find("td:eq(0)").text();

        var href = 'ujmerlegjegy/?id='+id;
        
        
        $('#elsoOsztEgysegAr').val($('#elsoOsztalyAr').text());
        $('#masodOsztEgysegAr').val($('#masodOsztolyAr').text());
        $('#harmadOsztEgysegAr').val($('#harmadOsztalyAr').text());
        $('#negyedOsztEgysegAr').val($('#negyedOsztalyAr').text());
        $('#vastagEgysegAr').val($('#vastagGyokerAr').text());
        $('#vekonyEgysegAr').val($('#vekonyGyokerAr').text());
       
      		

            $.get(href, function (users) {
            	$('.newVevoMerlegJegy #termeloId').val(users.id);
                $('.newVevoMerlegJegy #termeloNev').val(users.termeloNev);
                $('.newVevoMerlegJegy #termeloLnev').text(users.termeloLnev);
                $('.newVevoMerlegJegy #termeloCim').text(users.termeloCim);
                $('.newVevoMerlegJegy #termeloOstermeloiIgazolvanySzam').text(users.termeloOstermeloiIgazolvanySzam);
                
                $('.newVevoMerlegJegy #termeloAdoazonositoJel').text(users.termeloAdoazonositoJel);
                $('.newVevoMerlegJegy #termeloAdoSzam').text(users.termeloAdoSzam);
                $('.newVevoMerlegJegy #termeloSzuletesiHely').text(users.termeloSzuletesiHely);
                var dateValue = users.termeloSzuletesiIdo.split(/[- T :]/);
                var formatDate2 = new Date(Date.UTC(dateValue[0], dateValue[1]-1, dateValue[2]));
                month = '' + (formatDate2.getMonth() + 1),
        		day = '' + formatDate2.getDate(),
        		year = formatDate2.getFullYear();
        		if (month.length < 2) month = '0' + month;
    			if (day.length < 2) day = '0' + day;
    			var szuletesiDatum2 = [year, month, day].join('-');
                $('.newVevoMerlegJegy #termeloSzuletesiIdo').text(szuletesiDatum2);
                $('.newVevoMerlegJegy #termeloEdesAnyjaNeve').text(users.termeloEdesAnyjaNeve);
                $('.newVevoMerlegJegy #termeloTajSzam').text(users.termeloTajSzam);
                $('.newVevoMerlegJegy #termeloCsaladiGazdasagSzam').text(users.termeloCsaladiGazdasagSzam);
                $('.newVevoMerlegJegy #termeloGlobalGapSzam').text(users.termeloGlobalGapSzam);
                $('.newVevoMerlegJegy #termeloTelefonSzam').text(users.termeloTelefonSzam);
                $('.newVevoMerlegJegy #termeloBankszamlaSzam').text(users.termeloBankszamlaSzam);
            
            });
            
        $('#eladasDatum').text(year + '/' + month + '/' + day);   
    	
    	$('.newVevoMerlegJegy #newVevoMerlegModal').modal('show');
    });
    
    $('#newVevoMerlegModal').on('hidden.bs.modal', function() {
    	
    	
    	$('#elsoOsztEgysegAr').val($('#elsoOsztalyAr').text());
        $('#masodOsztEgysegAr').val($('#masodOsztolyAr').text());
        $('#harmadOsztEgysegAr').val($('#harmadOsztalyAr').text());
        $('#negyedOsztEgysegAr').val($('#negyedOsztalyAr').text());
        $('#vastagEgysegAr').val($('#vastagGyokerAr').text());
        $('#vekonyEgysegAr').val($('#vekonyGyokerAr').text());
        
    	$('.suly').val(0);
    	$('#osszSuly').text(0);
    	$('.levonas').val(5);
    	$('.osszeg').val(0);
    	$('#penznem').val("HUF");
    	$('#leadasDatum').val(0);
    	$('#fizetesiHatarido').val(0);
    	$('#kifizetesDatum').val(0);
    	$('#szamlaSorszam').val(0);
    
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
    
    //***************************************************************Ügyfelek masking***************************************************************************//
    
    
    $('#termeloTelefonSzamNew').inputmask({"mask": "(99) 999-9999"}); 
    
    $('#termeloTajSzamNew').inputmask({"mask": "999-999-999"}); 
    
    $('#termeloOstermeloiIgazolvanySzamNew').inputmask({"mask": "AA9999999"});     
    
    $('#termeloAdoazonositoJelNew').inputmask({"mask": "9999999999"});
    
    $('#termeloAdoSzamNew').inputmask({"mask": "99999999-9-99"});
    
    $('#termeloCsaladiGazdasagSzamNew').inputmask({"mask": "AAAA-99999999"});  
    
    $('#termeloGlobalGapSzamNew').inputmask({"mask": "AAA-99999999"}); 
    
    $('#termeloBankszamlaSzamNew').inputmask({"mask": "99999999-99999999-99999999"});   
    
    $('.inputMask').inputmask('decimal', {numericInput: true,
    	digits: '0',
      	radixPoint: '',
        groupSeparator: ' ',
        autoGroup: true,
        placeholder: ''
    
    
    });
    
    
    //*************************************************************Merlegjegy összead *******************************************//
    
       $('#UnpaidMerlegjegyLista').on('click','.addJegy', function() {
    
    	var row = $(this).closest("tr");
    	var mid = row.find("td:eq(1)").text();
    	var fid = $('#felvasarlasiJegyId').text();
    	
    	console.log(mid);
    	

        var href = 'getmerlegjegy/?id='+mid;
        
        var elsoOsztSuly;
        var masodOsztSuly;
        var harmadOsztSuly;
        var negyedOsztSuly;
        var vastagSuly;
        var vekonySuly;
        var elsoOsztAr;
        var masodOsztAr;
        var harmadOsztAr;
        var negyedOsztAr;
        var vastagAr;
        var vekonyAr;
        var osszAr;
        
      		$.post('/felvasarlas/savemjh', {fId: fid, mId: mid});
      		

            $.get(href, function (merlegjegy) {
            		
            		elsoOsztSuly = merlegjegy.elsoOsztalySuly;
            		masodOsztSuly = merlegjegy.masodOsztalySuly;
            		harmadOsztSuly = merlegjegy.harmadOsztalySuly;
            		negyedOsztSuly = merlegjegy.negyedOsztalySuly;
            		vastagSuly = merlegjegy.vastagGyokerSuly;
            		vekonySuly = merlegjegy.vekonyGyokerSuly;
            		elsoOsztAr = merlegjegy.elsoOsztalyErteke;
            		masodOsztAr = merlegjegy.masodOsztalyErteke;
            		harmadOsztAr = merlegjegy.harmadOsztalyErteke;
            		negyedOsztAr = merlegjegy.negyedOsztalyErteke;
            		vastagAr = merlegjegy.vastagErteke;
            		vekonyAr = merlegjegy.vekonyErteke;
            		osszAr = merlegjegy.osszAr;
            		
            		$('#elsoOsztSuly').val($('#elsoOsztSuly').val()*1 + elsoOsztSuly);
            		$('#masodOsztSuly').val($('#masodOsztSuly').val()*1 + masodOsztSuly);
            		$('#harmadOsztSuly').val($('#harmadOsztSuly').val()*1 + harmadOsztSuly);
            		$('#negyedOsztSuly').val($('#negyedOsztSuly').val()*1 + negyedOsztSuly);
            		$('#vastagSuly').val($('#vastagSuly').val()*1 + vastagSuly);
            		$('#vekonySuly').val($('#vekonySuly').val()*1 + vekonySuly);
            		
            		$('#elsoOsztAr').val($('#elsoOsztAr').val()*1 + elsoOsztAr);
            		$('#masodOsztAr').val($('#masodOsztAr').val()*1 + masodOsztAr);
            		$('#harmadOsztAr').val($('#harmadOsztAr').val()*1 + harmadOsztAr);
            		$('#negyedOsztAr').val($('#negyedOsztAr').val()*1 + negyedOsztAr);
            		$('#vastagAr').val($('#vastagAr').val()*1 + vastagAr);
            		$('#vekonyAr').val($('#vekonyAr').val()*1 + vekonyAr);
            		
            		$('#osszAr').val($('#osszAr').val()*1 + osszAr);
            		
            		
            	
                });
                
             this.disabled = true;   
        
    });
    
    
    //****************************************************************Select menü feltöltés ***************************************//
    
    
    
    $('#termeloSelect').select2({
    	
    	theme: "bootstrap-5",
    });
    
    //*******************************************************al felvásárlás menü ***************************************************//
    $('#ujAlfelvasarlaiJegyGomb').on('click', function(){
    	
    	var elsoOsztalyAr = $('#elsoOsztalyAr').text();
    	var masodOsztalyAr = $('#masodOsztalyAr').text();
    	var harmadOsztalyAr = $('#harmadOsztalyAr').text();
    	var negyedOsztalyAr = $('#negyedOsztalyAr').text();
    	var vastagGyokerAr = $('#vastagGyokerAr').text();
    	var vekonyGyokerAr = $('#vekonyGyokerAr').text();
    	
    	
    	
		$('#ujAlfelvasarlaiJegy').modal('show');
    
    });
    
   
   
    
})

