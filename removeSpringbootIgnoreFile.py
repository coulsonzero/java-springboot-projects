import os

def removeFile(path):
    for file in os.listdir(path):
        filepath = os.path.join(path, file)
        if os.path.isdir(filepath):
            if filepath.endswith(('target', '.idea')):
                print(filepath + '  deleted...')
                os.remove(filepath)
            else:
                removeFile(filepath)
        if os.path.isfile(filepath) and filepath.endswith(('iml', '.DS_Store')):
                print(filepath + '  removed...')
                os.remove(filepath)


if __name__ == "__main__":
    path = "/Users/coulsonzero/Downloads/python"
    removeFile(path)
    print("All ignore file is deleted !!")

