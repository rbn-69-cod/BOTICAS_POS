# Patrón Singleton

Mantiene una única configuración para el nombre, moneda y tasa de IGV. Utiliza
`BigDecimal` para evitar errores de precisión monetaria.

```powershell
javac -encoding UTF-8 -d target/patrones 4-PATRONES_DE_DISENO/Creacionales/1-Patron_Singleton/*.java
java -cp target/patrones patrones.singleton.Main
```
