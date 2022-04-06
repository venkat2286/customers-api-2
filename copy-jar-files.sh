echo ""
echo ""
echo " Copying docker file"
echo ""
echo ""
echo ""
echo ""
echo ""
echo ""

cp -r  build_jar/Dockerfile Dockerfile

echo " Copying pom  file"
echo ""
echo ""

cp -r  build_jar/pom.xml pom.xml


echo ""
echo ""
echo ""echo " Copying pom  file"
cp -r  build_jar/IndicesApiBoot.java src/main/java/com/deere/u90242/agreements/IndicesApiBoot.java



echo ""
echo ""
echo ""

echo ""
echo ""
echo ""

echo ""
echo ""
echo ""
rm src/main/java/com/deere/u90242/agreements/IndicesApiWeb.java




echo ""echo " Completed"