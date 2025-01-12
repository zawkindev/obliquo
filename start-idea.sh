#!/usr/bin/env bash

# Start IntelliJ IDEA inside nix-shell
nix-shell --run "nohup idea . &>/dev/null &"
