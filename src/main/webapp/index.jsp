
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<form method="post" action="/discount">
  <label for="description">Product Description</label>
  <input type="text" id="description" name="Description"/> <br>
  <label for="price">List Price</label>
  <input type="text" id="price" name="Price"/> <br>
  <label for="discount">Discount Percent</label>
  <input type="text" id="discount" name="Discount"/> <br>
  <input type="submit" id="submit" value="Discount Amount"/>
</form>
</body>
</html>