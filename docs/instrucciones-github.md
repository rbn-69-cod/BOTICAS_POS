# Instrucciones para trabajar en equipo con GitHub

## 1. Clonar repositorio

```bash
git clone https://github.com/igarlo56/SYS-PROFAR-DOCS.git
cd SYS-PROFAR-DOCS
```

## 2. Crear rama personal

```bash
git checkout -b aldo-avance
```

## 3. Primer commit sugerido

```bash
git add README.md docs/ 2-MODELO_UML/Comportamiento/
git commit -m "Adapta documentacion de comportamiento para COOPAC"
```

## 4. Segundo commit sugerido

```bash
git add 2-MODELO_UML/Estructural/ pom.xml src/
git commit -m "Adapta diagrama estructural del sistema COOPAC"
```

## 5. Subir rama

```bash
git push origin aldo-avance
```

## 6. Verificar commits

```bash
git log --oneline
```

Debe aparecer al menos dos commits propios.
