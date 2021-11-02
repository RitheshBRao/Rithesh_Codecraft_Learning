import os
import shutil
import time
import sys

# Mention the folder to delete -> here the folder is Temp -> Windows+R -> %temp%
TEMP_PATH = "C:\\Users\\RitheshB\\AppData\\Local\\Temp\\elitegamer"

def user_msg(iteration):
    for i in range(iteration):
        print(" - * - ", end="", flush=True)
        time.sleep(.2)
        # https://stackoverflow.com/questions/35230959/printfoo-end-not-working-in-terminal
        # sys.stdout.flush()

# First check whether temp folder exists or not
if(os.path.isdir(TEMP_PATH)):
    try:
        # If flder exists delete the temp folder recursively
        shutil.rmtree(TEMP_PATH)
        print("\n>>> SUCCESS: temp folder deleted successfully\n")
        user_msg(1)
    except:
        # If folder files are open -> Can not delete the folder -> Show the msg
        print("\n>>> FAILURE: Please quit the Elite Gamer apllication from system tray and manually delete the temp folder\n")
        user_msg(7)
else:
    print("\n>>> temp folder not found\n")
    user_msg(7)


