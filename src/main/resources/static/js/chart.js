$(function(){	
	
	const date = [];
   	const elsoOszt = [];
   	const masodOszt = [];
   	const harmadOszt = [];
   	const negyedOszt = [];
   	const vastagOszt = [];
   	const vekonyOszt = [];
   	
   	chart();
    
    
    
   async function chart(){
   		await getData();
   		
   		var ctx = document.getElementById('myChart').getContext('2d');
			var chart = new Chart(ctx, {
			    // The type of chart we want to create
			    
			    
			    type: 'line',
			    data: {
			        labels: date,
			        datasets: [{
			            label: 'I. osztály',
			            backgroundColor: 'rgb(255, 99, 132)',
			            borderColor: 'rgb(2, 117, 216)',
			            data: elsoOszt,
			            fill: false,
			            hidden: true
			        }
			        ,{
			        label: 'II. osztály',
			            backgroundColor: 'rgb(255, 99, 132)',
			            borderColor: 'rgb(92, 184, 92)',
			            data: masodOszt,
			            fill: false,
			            hidden: true
			        }
			        ,{
			        label: 'III. osztály',
			            backgroundColor: 'rgb(255, 99, 132)',
			            borderColor: 'rgb(91, 192, 222)',
			            data: harmadOszt,
			            fill: false,
			            hidden: true
			        }
			        ,{
			        label: 'IV. osztály',
			            backgroundColor: 'rgb(255, 99, 132)',
			            borderColor: 'rgb(240, 173, 78)',
			            data: negyedOszt,
			            fill: false,
			            hidden: true
			        }
			        ,{
			        label: 'Vastag gyökér',
			            backgroundColor: 'rgb(255, 99, 132)',
			            borderColor: 'rgb(217, 83, 79)',
			            data: vastagOszt,
			            fill: false,
			            hidden: true
			        }
			        ,{
			        label: 'Vékony gyökér',
			            backgroundColor: 'rgb(255, 99, 132)',
			            borderColor: 'rgb(217, 83, 79)',
			            data: vekonyOszt,
			            fill: false,
			            hidden: true
			        }
			        
			        ]
			    },
			
			    // Configuration options go here
			    options: {
			    
			    
			    }
			});   
   
   }
   
   async function getData(){
    	$.get("/chart", function (chart) {
            	for(i = 0; i < chart.length; i++){
            		
            		date.push(chart[i].datum);
            		elsoOszt.push(chart[i].napiElsoOsszSuly);
            		masodOszt.push(chart[i].napiMasodOsszSuly);
            		harmadOszt.push(chart[i].napiHarmadOsszSuly);
            		negyedOszt.push(chart[i].napiNegyedOsszSuly);
            		vastagOszt.push(chart[i].napiVastagOsszSuly);
            		vekonyOszt.push(chart[i].napiVekonyOsszSuly);
            		
            	}
            
            });
            
            
    }
    
    
})