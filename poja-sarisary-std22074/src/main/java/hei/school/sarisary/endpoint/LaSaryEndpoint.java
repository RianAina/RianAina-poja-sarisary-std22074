

public String transformImage(String id, MultiplepartFileimage) throws IOException {
    String suffix = "." + FilenameUtils.getExtension(image.getOriginalFilename());
    String prefixOriginal = id + "-initial";
    String prefixTransformed = id + "-grayscaled";
    String bucketKeyOriginal = directory + prefixOriginal + suffix;
    String bucketKeyTransformed = directory + prefixTransformed + suffix ;

    File toUpload = File.createTempFile(prefixOriginal, suffix);
    image.transfertTo (toUpload);
    File grayScaled = this.toGrayScale(id, toUpload)


        bucketComponent.Upload(toUpload, bucketKeyOriginal);
        bucketComponent.Upload(grayscaled, bucketKeyTransformed);



        }