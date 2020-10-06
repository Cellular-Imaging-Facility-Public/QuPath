import qupath.lib.scripting.QP
import qupath.lib.regions.*


def imageData = QP.getCurrentImageData()

setImageType('FLUORESCENCE')
createSelectAllObject(true)
runPlugin('qupath.imagej.detect.cells.WatershedCellDetection', '{"detectionImage": "Nuclei",  "requestedPixelSizeMicrons": 1.0,  "backgroundRadiusMicrons": 8.0,  "medianRadiusMicrons": 0.0,  "sigmaMicrons": 1.5,  "minAreaMicrons": 20.0,  "maxAreaMicrons": 200.0,  "threshold": 800.0,  "watershedPostProcess": true,  "cellExpansionMicrons": 7.0,  "includeNuclei": true,  "smoothBoundaries": true,  "makeMeasurements": true}')
//runPlugin('qupath.lib.algorithms.IntensityFeaturesPlugin', '{"pixelSizeMicrons": 2.0,  "region": "ROI",  "tileSizeMicrons": 25.0,  "channel1": true,  "channel2": true,  "channel3": true,  "doMean": true,  "doStdDev": true,  "doMinMax": true,  "doMedian": true,  "doHaralick": false,  "haralickMin": NaN,  "haralickMax": NaN,  "haralickDistance": 1,  "haralickBins": 32}');
pathClass()