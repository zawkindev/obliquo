{ pkgs ? import <nixpkgs> { } }:
pkgs.mkShell {
  buildInputs = with pkgs;[
    openjdk21
    maven
  ];
  shellHook = ''
    echo "Java 21 and Maven are ready to use!"
    java -version
    mvn --version
  '';
}
