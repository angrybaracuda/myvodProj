<html>
    <body>
        <h2>Jersey RESTful Web Application!</h2>
        <p><a href="webapi/myresource">Jersey resource</a>
        <p>Visit <a href="http://jersey.java.net">Project Jersey website</a>
            for more information on Jersey!

        <form method="POST" action="upload" enctype="multipart/form-data" >
            File:
            <input type="file" name="file" id="file" /> <br/>
            Destination:
            <input type="text" value="/tmp" name="destination"/>
            </br>
            <input type="submit" value="Upload" name="upload" id="upload" />
        </form>
    </body>
</html>
