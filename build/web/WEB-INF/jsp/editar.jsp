
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Crud</title>
    </head>
    <body>
 <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info"
                     <h4>Actualizar Registro</h4>     
            </div>
                <div class="card_body">
                    <form method="POST">
                        <label>Nombres</label>
                        <input type="text" name="nom" class="form-control" value="${lista[0].Nombres}">
                        <label>Correo</label>
                        <input type="text" name="correo" class="form-control" value="${lista[0].Correo}">
                        <label>Nacionalidad</label>
                        <input type="text" name="nacio" class="form-control" value="${lista[0].Nacionalidad}"><br>
                        <input type="submit" value="Actualizar" class="btn btn-success">
                        <a href="index.htm">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
