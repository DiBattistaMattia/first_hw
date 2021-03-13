#!/bin/bash
git log --grep="Added" --name-status --date=iso --stat HEAD --abbrev-commit

