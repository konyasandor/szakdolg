$(function(){
	
	var elsoMeresegy = $("#elsoMeresegy").val();
	var elsoMeresKetto = $("#elsoMeresKetto").val();
	
	var eredmeny = elsoMeresegy-elsoMeresKetto;
	
	$("#eredményElso").text(eredmeny);
})