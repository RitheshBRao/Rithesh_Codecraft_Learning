import os
import shutil
import time
import sys
import threading

# Mention the folder to delete -> here the folder is Temp -> Windows+R -> %temp%
TEMP_PATH = "C:\\Users\\RitheshB\\AppData\\Local\\Temp\\elitegamer"

def user_msg(iteration):
    for i in range(iteration):
        print(" - > ", end="", flush=True)
        time.sleep(.5)
        # https://stackoverflow.com/questions/35230959/printfoo-end-not-working-in-terminal
        # sys.stdout.flush()

# First check whether temp folder exists or not
if(os.path.isdir(TEMP_PATH)):
    try:
        # If flder exists delete the temp folder recursively
        shutil.rmtree(TEMP_PATH)
        print("\n>>> SUCCESS: temp folder deleted successfully\n")
        first_thread = threading.Thread(target=user_msg, args=(12,))
        try:
            print("\n>>> Luanching Elite Gamer\n")
            os.startfile(r"C:\\Program Files (x86)\\Elite Gamer\\Elite Gamer.exe")
            first_thread.start()
        except:
            print("\n>>> FAILURE: Please Luanch Elite Gamer application manually \n")
    except:
        # If folder files are open -> Can not delete the folder -> Show the msg
        print("\n>>> FAILURE: Please quit the Elite Gamer apllication from system tray and manually delete the temp folder\n")
        user_msg(7)
else:
    print("\n>>> temp folder not found\n")
    user_msg(7)

time.sleep(5)


