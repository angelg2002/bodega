<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bodega ADSO - Stock</title>
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>

    <div class="card">
        <h1>Panel de Bodega</h1>
        <p style="color: #94a3b8; margin-bottom: 1.5rem;">Gestión de inventario local</p>
        
        <% 
           String mensaje = (String) request.getAttribute("mensaje");
           if (mensaje != null) { 
        %>
            <div class="alerta">
                ✅ Registrado: <strong><%= mensaje %></strong>
            </div>
        <% } %>

        <form method="POST" action="inicio">
            <label style="display:block; margin-bottom: 5px; font-size: 0.9rem;">Nombre del artículo:</label>
            <input type="text" name="dato" required placeholder="Ej: Laptop, Mouse...">
            
            <button type="submit">Guardar en Stock 🚀</button>
        </form>
    </div>

</body>
</html>