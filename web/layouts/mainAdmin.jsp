<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html lang="en">
    <head>
        <title><tiles:insertAttribute name="title" ignore="true"/></title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="style/css/bootstrap.min.css" />
        <link rel="stylesheet" href="style/css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="style/css/fullcalendar.css" />
        <link rel="stylesheet" href="style/css/maruti-style.css" />
        <link rel="stylesheet" href="style/css/maruti-media.css" class="skin-color" />
    </head>
    <body>
        <tiles:insertAttribute name="header"/>

        <div id="sidebar">
            <tiles:insertAttribute name="menu"/>
        </div>
        <div id="content">
            <tiles:insertAttribute name="body"/>
        </div>
        <div class="row-fluid">
            <tiles:insertAttribute name="footer"/>
        </div>
        <script src="js/excanvas.min.js"></script> 
        <script src="js/jquery.min.js"></script> 
        <script src="js/jquery.ui.custom.js"></script> 
        <script src="js/bootstrap.min.js"></script> 
        <script src="js/jquery.flot.min.js"></script> 
        <script src="js/jquery.flot.resize.min.js"></script> 
        <script src="js/jquery.peity.min.js"></script> 
        <script src="js/fullcalendar.min.js"></script> 
        <script src="js/maruti.js"></script> 
        <script src="js/maruti.dashboard.js"></script> 
        <script src="js/maruti.chat.js"></script> 
        <script type="text/javascript">
            // This function is called from the pop-up menus to transfer to
            // a different page. Ignore if the value returned is a null string:
            function goPage(newURL) {

                // if url is empty, skip the menu dividers and reset the menu selection to default
                if (newURL != "") {

                    // if url is "-", it is this page -- reset the menu:
                    if (newURL == "-") {
                        resetMenu();
                    }
                    // else, send page to designated URL            
                    else {
                        document.location.href = newURL;
                    }
                }
            }

            // resets the menu selection upon entry to this page:
            function resetMenu() {
                document.gomenu.selector.selectedIndex = 2;
            }
        </script>
    </body>
</html>
