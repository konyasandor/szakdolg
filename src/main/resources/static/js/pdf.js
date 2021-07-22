$(function(){
    $("#download").on("click", function () {
    
    	var nev = $('#termeloNev').val();
    	
    	const d = new Date();
		var year = d.getFullYear();
		var month = d.getMonth();
		var day = d.getDate();

        var opt = {
            margin:       10,
            filename:     nev + '_' + year + '/' + month + '/' + day + '.pdf',
            image:        { type: 'jpeg', quality: 0.98 },
            html2canvas:  { scale: 4 },
            jsPDF:        { unit: 'mm', format: 'letter', orientation: 'portrait' }
          };
        // Choose the element that our invoice is rendered in.
        const element = document.getElementById("merlegprint");
        // Choose the element and save the PDF for our user.
        html2pdf()
          .set(opt)
          .from(element)
          .save();

        } );

})