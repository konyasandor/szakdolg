$(function(){

	
	$('#elsoOsztEgysegAr').focusout(function(){
	
		var levonas = ((100-$('#elsoOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#elsoOsztBruttoSuly').val()*levonas,10);
	
		$('#elsoOsztalyNettoSuly').val(netto);
		
		$('#elsoOsztalyErteke').val(netto*$('#elsoOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
		
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
				
	$('#elsoOsztBruttoSuly').focusout(function(){
	
		var levonas = ((100-$('#elsoOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#elsoOsztBruttoSuly').val()*levonas,10);
	
		$('#elsoOsztalyNettoSuly').val(netto);
		
		$('#elsoOsztalyErteke').val(netto*$('#elsoOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
	
	$('#elsoOsztLevonas').focusout(function(){
	
		var levonas = ((100-$('#elsoOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#elsoOsztBruttoSuly').val()*levonas,10);
	
		$('#elsoOsztalyNettoSuly').val(netto);
		
		$('#elsoOsztalyErteke').val(netto*$('#elsoOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
	
	$('#masodOsztEgysegAr').focusout(function(){
	
		var levonas = ((100-$('#masodOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#masodOsztBruttoSuly').val()*levonas,10);
	
		$('#masodOsztalyNettoSuly').val(netto);
		
		$('#masodOsztalyErteke').val(netto*$('#masodOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
				
	$('#masodOsztBruttoSuly').focusout(function(){
	
		var levonas = ((100-$('#masodOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#masodOsztBruttoSuly').val()*levonas,10);
	
		$('#masodOsztalyNettoSuly').val(netto);
		
		$('#masodOsztalyErteke').val(netto*$('#masodOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
	
	$('#masodOsztLevonas').focusout(function(){
	
		var levonas = ((100-$('#masodOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#masodOsztBruttoSuly').val()*levonas,10);
	
		$('#masodOsztalyNettoSuly').val(netto);
		
		$('#masodOsztalyErteke').val(netto*$('#masodOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
	
	$('#harmadOsztEgysegAr').focusout(function(){
	
		var levonas = ((100-$('#harmadOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#harmadOsztBruttoSuly').val()*levonas,10);
	
		$('#harmadOsztalyNettoSuly').val(netto);
		
		$('#harmadOsztalyErteke').val(netto*$('#harmadOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
				
	$('#harmadOsztBruttoSuly').focusout(function(){
	
		var levonas = ((100-$('#harmadOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#harmadOsztBruttoSuly').val()*levonas,10);
	
		$('#harmadOsztalyNettoSuly').val(netto);
		
		$('#harmadOsztalyErteke').val(netto*$('#harmadOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
	
	$('#harmadOsztLevonas').focusout(function(){
	
		var levonas = ((100-$('#harmadOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#harmadOsztBruttoSuly').val()*levonas,10);
	
		$('#harmadOsztalyNettoSuly').val(netto);
		
		$('#harmadOsztalyErteke').val(netto*$('#harmadOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
	
	$('#negyedOsztEgysegAr').focusout(function(){
	
		var levonas = ((100-$('#negyedOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#negyedOsztBruttoSuly').val()*levonas,10);
	
		$('#negyedOsztalyNettoSuly').val(netto);
		
		$('#negyedOsztalyErteke').val(netto*$('#negyedOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
				
	$('#negyedOsztBruttoSuly').focusout(function(){
	
		var levonas = ((100-$('#negyedOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#negyedOsztBruttoSuly').val()*levonas,10);
	
		$('#negyedOsztalyNettoSuly').val(netto);
		
		$('#negyedOsztalyErteke').val(netto*$('#negyedOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
	
	$('#negyedOsztLevonas').focusout(function(){
	
		var levonas = ((100-$('#negyedOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#negyedOsztBruttoSuly').val()*levonas,10);
	
		$('#negyedOsztalyNettoSuly').val(netto);
		
		$('#negyedOsztalyErteke').val(netto*$('#negyedOsztEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
	
	$('#vastagEgysegAr').focusout(function(){
	
		var levonas = ((100-$('#vastagLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#vastagBruttoSuly').val()*levonas,10);
	
		$('#vastagNettoSuly').val(netto);
		
		$('#vastagErteke').val(netto*$('#vastagEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
				
	$('#vastagBruttoSuly').focusout(function(){
	
		var levonas = ((100-$('#vastagLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#vastagBruttoSuly').val()*levonas,10);
	
		$('#vastagNettoSuly').val(netto);
		
		$('#vastagErteke').val(netto*$('#vastagEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
	
	$('#vastagLevonas').focusout(function(){
	
		var levonas = ((100-$('#negyedOsztLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#negyedOsztBruttoSuly').val()*levonas,10);
	
		$('#vastagNettoSuly').val(netto);
		
		$('#vastagErteke').val(netto*$('#vastagEgysegAr').val());

		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
	
	$('#vekonyEgysegAr').focusout(function(){
	
		var levonas = ((100-$('#vekonyLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#vekonyBruttoSuly').val()*levonas,10);
	
		$('#vekonyNettoSuly').val(netto);
		
		$('#vekonyErteke').val(netto*$('#vekonyEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
				
	$('#vekonyBruttoSuly').focusout(function(){
	
		var levonas = ((100-$('#vekonyLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#vekonyBruttoSuly').val()*levonas,10);
	
		$('#vekonyNettoSuly').val(netto);
		
		$('#vekonyErteke').val(netto*$('#vekonyEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
	
	$('#vekonyLevonas').focusout(function(){
	
		var levonas = ((100-$('#vekonyLevonas').val())*0.01).toFixed(2);
		var netto = parseInt($('#vekonyBruttoSuly').val()*levonas,10);
	
		$('#vekonyNettoSuly').val(netto);
		
		$('#vekonyErteke').val(netto*$('#vekonyEgysegAr').val());

		
		$('#osszSuly').text($('#elsoOsztalyNettoSuly').val()*1 + $('#masodOsztalyNettoSuly').val()*1 + $('#harmadOsztalyNettoSuly').val()*1 + $('#negyedOsztalyNettoSuly').val()*1 + $('#vastagNettoSuly').val()*1 + $('#vekonyNettoSuly').val()*1);
		
		$('#osszAr').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	
		$('#fizetendő').val($('#elsoOsztalyErteke').val()*1 + $('#masodOsztalyErteke').val()*1 + $('#harmadOsztalyErteke').val()*1 + $('#negyedOsztalyErteke').val()*1 + $('#vastagErteke').val()*1 + $('#vekonyErteke').val()*1);
	});
	
	$('#eloleg').focusout(function(){
	
		
	
		$('#fizetendő').val($('#osszar').val()*1 - $('#eloleg').val()*1);
		
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
        
        
        $('#elsoOsztEgysegAr').val($('#elsoOsztalyAr').text());
        $('#masodOsztEgysegAr').val($('#masodOsztolyAr').text());
        $('#harmadOsztEgysegAr').val($('#harmadOsztalyAr').text());
        $('#negyedOsztEgysegAr').val($('#negyedOsztalyAr').text());
        $('#vastagEgysegAr').val($('#vastagGyokerAr').text());
        $('#vekonyEgysegAr').val($('#vekonyGyokerAr').text());
       
      		

            $.get(href, function (users) {
            	$('.newMerlegJegy #termeloId').text(users.id);
                $('.newMerlegJegy #termeloNev').text(users.termeloNev);
                $('.newMerlegJegy #termeloLnev').text(users.termeloLnev);
                $('.newMerlegJegy #termeloCim').text(users.termeloCim);
                $('.newMerlegJegy #termeloOstermeloiIgazolvanySzam').text(users.termeloOstermeloiIgazolvanySzam);
                $('.newMerlegJegy #termeloOstermeloiIgazolvanyErvenyesseg').text(users.termeloOstermeloiIgazolvanyErvenyesseg);
                $('.newMerlegJegy #termeloAdoazonositoJel').text(users.termeloAdoazonositoJel);
                $('.newMerlegJegy #termeloAdoSzam').text(users.termeloAdoSzam);
                $('.newMerlegJegy #termeloSzuletesiHely').text(users.termeloSzuletesiHely);
                $('.newMerlegJegy #termeloSzuletesiIdo').text(users.termeloSzuletesiIdo);
                $('.newMerlegJegy #termeloEdesAnyjaNeve').text(users.termeloEdesAnyjaNeve);
                $('.newMerlegJegy #termeloTajSzam').text(users.termeloTajSzam);
                $('.newMerlegJegy #termeloCsaladiGazdasagSzam').text(users.termeloCsaladiGazdasagSzam);
                $('.newMerlegJegy #termeloGlobalGapSzam').text(users.termeloGlobalGapSzam);
                $('.newMerlegJegy #termeloTelefonSzam').text(users.termeloTelefonSzam);
                $('.newMerlegJegy #termeloBankszamlaSzam').text(users.termeloBankszamlaSzam);
            
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

