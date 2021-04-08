$(function(){
    $(document).ready( function () {
        $('#merlegjegyTable').DataTable({
        	"sAjaxSource": "/termelok",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "id"},
		          { "mData": "termeloNev" },
				  { "mData": "termeloCim" },
				  { "mData": "termeloTelefonSzam" },
				  { "defaultContent": '<button type="button" class="btn newMerleg"> <i class="fas fa-external-link-alt"></i></button>' }
				  
			],
            language: {
                "emptyTable": "Nincs rendelkezésre álló adat",
                "info": "Találatok: _START_ - _END_ Összesen: _TOTAL_",
                "infoEmpty": "Nulla találat",
                "infoFiltered": "(_MAX_ összes rekord közül szűrve)",
                "infoThousands": " ",
                "lengthMenu": "_MENU_ találat oldalanként",
                "loadingRecords": "Betöltés...",
                "processing": "Feldolgozás...",
                "search": "Keresés:",
                "zeroRecords": "Nincs a keresésnek megfelelő találat",
                "paginate": {
                    "first": "Első",
                    "previous": "Előző",
                    "next": "Következő",
                    "last": "Utolsó"
                },
                "aria": {
                    "sortAscending": ": aktiválja a növekvő rendezéshez",
                    "sortDescending": ": aktiválja a csökkenő rendezéshez"
                },
                "select": {
                    "rows": {
                        "_": "%d sor kiválasztva",
                        "1": "1 sor kiválasztva"
                    },
                    "1": "%d sor kiválasztva",
                    "_": "%d sor kiválasztva",
                    "cells": {
                        "1": "1 cella kiválasztva",
                        "_": "%d cella kiválasztva"
                    },
                    "columns": {
                        "1": "1 oszlop kiválasztva",
                        "_": "%d oszlop kiválasztva"
                    }
                },
                "buttons": {
                    "print": "Nyomtatás",
                    "colvis": "Oszlopok",
                    "copy": "Másolás",
                    "copyTitle": "Vágólapra másolás",
                    "copySuccess": {
                        "_": "%d sor másolva",
                        "1": "1 sor másolva"
                    },
                    "collection": "Gyűjtemény",
                    "colvisRestore": "Oszlopok visszaállítása",
                    "copyKeys": "Nyomja meg a CTRL vagy u2318 + C gombokat a táblázat adatainak a vágólapra másolásához.<br \/><br \/>A megszakításhoz kattintson az üzenetre vagy nyomja meg az ESC billentyűt.",
                    "csv": "CSV",
                    "excel": "Excel",
                    "pageLength": {
                        "-1": "Összes sor megjelenítése",
                        "1": "1 sor megjelenítése",
                        "_": "%d sor megjelenítése"
                    },
                    "pdf": "PDF"
                },
                "autoFill": {
                    "cancel": "Megszakítás",
                    "fill": "Összes cella kitöltése a következővel: <i>%d<\/i>",
                    "fillHorizontal": "Cellák vízszintes kitöltése",
                    "fillVertical": "Cellák függőleges kitöltése"
                },
                "searchBuilder": {
                    "add": "Feltétel hozzáadása",
                    "button": {
                        "0": "Keresés konfigurátor",
                        "_": "Keresés konfigurátor (%d)"
                    },
                    "clearAll": "Összes feltétel törlése",
                    "condition": "Feltétel",
                    "conditions": {
                        "date": {
                            "after": "Után",
                            "before": "Előtt",
                            "between": "Között",
                            "empty": "Üres",
                            "equals": "Egyenlő",
                            "not": "Nem",
                            "notBetween": "Kívül eső",
                            "notEmpty": "Nem üres"
                        },
                        "moment": {
                            "after": "Után",
                            "before": "Előtt",
                            "between": "Között",
                            "empty": "Üres",
                            "equals": "Egyenlő",
                            "not": "Nem",
                            "notBetween": "Kívül eső",
                            "notEmpty": "Nem üres"
                        },
                        "number": {
                            "between": "Között",
                            "empty": "Üres",
                            "equals": "Egyenlő",
                            "gt": "Nagyobb mint",
                            "gte": "Nagyobb vagy egyenlő mint",
                            "lt": "Kissebb mint",
                            "lte": "Kissebb vagy egyenlő mint",
                            "not": "Nem",
                            "notBetween": "Kívül eső",
                            "notEmpty": "Nem üres"
                        },
                        "string": {
                            "contains": "Tartalmazza",
                            "empty": "Üres",
                            "endsWith": "Végződik",
                            "equals": "Egyenlő",
                            "not": "Nem",
                            "notEmpty": "Nem üres",
                            "startsWith": "Kezdődik"
                        }
                    },
                    "data": "Adat",
                    "deleteTitle": "Feltétel törlése",
                    "logicAnd": "És",
                    "logicOr": "Vagy",
                    "title": {
                        "0": "Keresés konfigurátor",
                        "_": "Keresés konfigurátor (%d)"
                    },
                    "value": "Érték"
                },
                "searchPanes": {
                    "clearMessage": "Szűrők törlése",
                    "collapse": {
                        "0": "Szűrőpanelek",
                        "_": "Szűrőpanelek (%d)"
                    },
                    "count": "{total}",
                    "countFiltered": "{shown} ({total})",
                    "emptyPanes": "Nincsenek szűrőpanelek",
                    "loadMessage": "Szűrőpanelek betöltése",
                    "title": "Aktív szűrőpanelek: %d"
                },
                "searchPlaceholder": "keresés"
            }
        });
    } );
    
    $(document).ready( function () {
        $('#ugyfelTable').DataTable({
        	"sAjaxSource": "/termelok",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "id"},
		          { "mData": "termeloNev" },
				  { "mData": "termeloCim" },
				  { "mData": "termeloTelefonSzam" },
				  { "defaultContent": '<button type="button" class="btn editUser"> <i class="fas fa-external-link-alt"></i></button>' }
				  
			],
            language: {
                "emptyTable": "Nincs rendelkezésre álló adat",
                "info": "Találatok: _START_ - _END_ Összesen: _TOTAL_",
                "infoEmpty": "Nulla találat",
                "infoFiltered": "(_MAX_ összes rekord közül szűrve)",
                "infoThousands": " ",
                "lengthMenu": "_MENU_ találat oldalanként",
                "loadingRecords": "Betöltés...",
                "processing": "Feldolgozás...",
                "search": "Keresés:",
                "zeroRecords": "Nincs a keresésnek megfelelő találat",
                "paginate": {
                    "first": "Első",
                    "previous": "Előző",
                    "next": "Következő",
                    "last": "Utolsó"
                },
                "aria": {
                    "sortAscending": ": aktiválja a növekvő rendezéshez",
                    "sortDescending": ": aktiválja a csökkenő rendezéshez"
                },
                "select": {
                    "rows": {
                        "_": "%d sor kiválasztva",
                        "1": "1 sor kiválasztva"
                    },
                    "1": "%d sor kiválasztva",
                    "_": "%d sor kiválasztva",
                    "cells": {
                        "1": "1 cella kiválasztva",
                        "_": "%d cella kiválasztva"
                    },
                    "columns": {
                        "1": "1 oszlop kiválasztva",
                        "_": "%d oszlop kiválasztva"
                    }
                },
                "buttons": {
                    "print": "Nyomtatás",
                    "colvis": "Oszlopok",
                    "copy": "Másolás",
                    "copyTitle": "Vágólapra másolás",
                    "copySuccess": {
                        "_": "%d sor másolva",
                        "1": "1 sor másolva"
                    },
                    "collection": "Gyűjtemény",
                    "colvisRestore": "Oszlopok visszaállítása",
                    "copyKeys": "Nyomja meg a CTRL vagy u2318 + C gombokat a táblázat adatainak a vágólapra másolásához.<br \/><br \/>A megszakításhoz kattintson az üzenetre vagy nyomja meg az ESC billentyűt.",
                    "csv": "CSV",
                    "excel": "Excel",
                    "pageLength": {
                        "-1": "Összes sor megjelenítése",
                        "1": "1 sor megjelenítése",
                        "_": "%d sor megjelenítése"
                    },
                    "pdf": "PDF"
                },
                "autoFill": {
                    "cancel": "Megszakítás",
                    "fill": "Összes cella kitöltése a következővel: <i>%d<\/i>",
                    "fillHorizontal": "Cellák vízszintes kitöltése",
                    "fillVertical": "Cellák függőleges kitöltése"
                },
                "searchBuilder": {
                    "add": "Feltétel hozzáadása",
                    "button": {
                        "0": "Keresés konfigurátor",
                        "_": "Keresés konfigurátor (%d)"
                    },
                    "clearAll": "Összes feltétel törlése",
                    "condition": "Feltétel",
                    "conditions": {
                        "date": {
                            "after": "Után",
                            "before": "Előtt",
                            "between": "Között",
                            "empty": "Üres",
                            "equals": "Egyenlő",
                            "not": "Nem",
                            "notBetween": "Kívül eső",
                            "notEmpty": "Nem üres"
                        },
                        "moment": {
                            "after": "Után",
                            "before": "Előtt",
                            "between": "Között",
                            "empty": "Üres",
                            "equals": "Egyenlő",
                            "not": "Nem",
                            "notBetween": "Kívül eső",
                            "notEmpty": "Nem üres"
                        },
                        "number": {
                            "between": "Között",
                            "empty": "Üres",
                            "equals": "Egyenlő",
                            "gt": "Nagyobb mint",
                            "gte": "Nagyobb vagy egyenlő mint",
                            "lt": "Kissebb mint",
                            "lte": "Kissebb vagy egyenlő mint",
                            "not": "Nem",
                            "notBetween": "Kívül eső",
                            "notEmpty": "Nem üres"
                        },
                        "string": {
                            "contains": "Tartalmazza",
                            "empty": "Üres",
                            "endsWith": "Végződik",
                            "equals": "Egyenlő",
                            "not": "Nem",
                            "notEmpty": "Nem üres",
                            "startsWith": "Kezdődik"
                        }
                    },
                    "data": "Adat",
                    "deleteTitle": "Feltétel törlése",
                    "logicAnd": "És",
                    "logicOr": "Vagy",
                    "title": {
                        "0": "Keresés konfigurátor",
                        "_": "Keresés konfigurátor (%d)"
                    },
                    "value": "Érték"
                },
                "searchPanes": {
                    "clearMessage": "Szűrők törlése",
                    "collapse": {
                        "0": "Szűrőpanelek",
                        "_": "Szűrőpanelek (%d)"
                    },
                    "count": "{total}",
                    "countFiltered": "{shown} ({total})",
                    "emptyPanes": "Nincsenek szűrőpanelek",
                    "loadMessage": "Szűrőpanelek betöltése",
                    "title": "Aktív szűrőpanelek: %d"
                },
                "searchPlaceholder": "keresés"
            }
        });
    } );
    
    function format ( d ) {
    // `d` is the original data object for the row
    return '<div class="card-body">'+
		    '<table class="table table-primary table-striped table-hover">'+
		        '<tr>'+
		            '<td>I. osztály súly</td>'+
		            '<td>'+d.elsoOsztalySuly+'</td>'+
		        '</tr>'+
		        '<tr>'+
		            '<td>II. osztály súly</td>'+
		            '<td>'+d.masodOsztalySuly+'</td>'+
		        '</tr>'+
		        '<tr>'+
		            '<td>III. osztály súly</td>'+
		            '<td>'+d.harmadOsztalySuly+'</td>'+
		        '</tr>'+
		        '<tr>'+
		            '<td>IV. osztály súly</td>'+
		            '<td>'+d.negyedOsztalySuly+'</td>'+
		        '</tr>'+
		        '<tr>'+
		            '<td>Vastaggyökér súly</td>'+
		            '<td>'+d.vastagGyokerSuly+'</td>'+
		        '</tr>'+
		        '<tr>'+
		            '<td>Vékonygyökér súly</td>'+
		            '<td>'+d.vekonyGyokerSuly+'</td>'+
		        '</tr>'+
		        
		    '</table>'+
		    '</div>';
	}
	 
	$(document).ready(function() {
	    var table = $('#merlegjegyLista').DataTable( {
	        "ajax": {"url":"/merlegjegytablelista",
	        		"dataSrc": ""},
	        "columns": [
	            {
	                "className":      'details-control',
	                "orderable":      false,
	                "data":           null,
	                "defaultContent": ''
	            },
	            { "data": "id" },
	            { "data": "tNev" },
	            { "data": "leadasDatum" },
	            { "data": "osszAr" }
	        ],
	        "order": [[1, 'asc']]
	    } );
	     
	    // Add event listener for opening and closing details
	    $('#merlegjegyLista tbody').on('click', 'td.details-control', function () {
	        var tr = $(this).closest('tr');
	        var row = table.row( tr );
	 
	        if ( row.child.isShown() ) {
	            // This row is already open - close it
	            row.child.hide();
	            tr.removeClass('shown');
	        }
	        else {
	            // Open this row
	            row.child( format(row.data()) ).show();
	            tr.addClass('shown');
	        }
	    } );
	} );

})