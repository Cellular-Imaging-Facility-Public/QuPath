//requires QuPath 0.2.x and above

def viewer = getCurrentViewer()
def channels = viewer.getImageDisplay().availableChannels()

//setting channel names
setChannelNames("Nuclei", "NCC", "MR")

//setting channel colors using RGB values
setChannelColors(
    getColorRGB(0, 0, 255), //blue
    getColorRGB(0, 255, 0), //green
    getColorRGB(255, 0, 0), //red
)

// Set the range for the channels
channels[0].setMinDisplay(0)
channels[0].setMaxDisplay(18300)
channels[1].setMinDisplay(0)
channels[1].setMaxDisplay(6200)
channels[2].setMinDisplay(0)
channels[2].setMaxDisplay(14000)

// Ensure the updates are visible
viewer.repaintEntireImage()

//Inform user it's done
print("Initialization done")