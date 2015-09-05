<%      
    if ((Boolean) userSession.getAttribute("premium")) {
        out.println("<div style='margin-top: 50px'>");
        out.println("<p><h2>Premium content</h2></p>");
        out.println("<img src='http://szuflandia.pjwstk.edu.pl/~s11719/premium.png'>");
        out.println("</div>");
    }

%>
