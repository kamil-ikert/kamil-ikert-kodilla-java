call runcrud.bat
if "%ERRORLEVEL%" == "0" goto browser
goto fail

:browser
start explorer "http://localhost:8080/crud/v1/tasks/getTasks"
if "%ERRORLEVEL%" == "0" goto end
echo.
echo There were problems with running browser.
goto fail

:fail
echo.
echo There were errors
echo Cannot open file: "runcrud.bat"

:end
echo.
echo Work is finish