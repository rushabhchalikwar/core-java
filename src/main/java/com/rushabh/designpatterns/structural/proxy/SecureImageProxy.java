package com.rushabh.designpatterns.structural.proxy;

// Proxy class that controls access to the HighResolutionImage
// Protection Proxy: Controls access to the real object based on user roles or permissions
class SecureImageProxy implements Image {
    private String fileName;
    private String userRole;
    private HighResolutionImage realImage;

    public SecureImageProxy(String fileName, String userRole) {
        this.fileName = fileName;
        this.userRole = userRole;
    }

    @Override
    public String getFilename() {
        return fileName;
    }

    @Override
    public void display() {
        if (!checkAccess()) {
            System.out.println("SecureImageProxy: ACCESS DENIED for " + fileName + " (role: " + userRole + ")");
            return;
        }
        if (realImage == null) {
            realImage = new HighResolutionImage(fileName);
        }
        realImage.display();
    }

    private boolean checkAccess() {
        System.out.println("SecureImageProxy: Checking access for role '" + userRole + "' on " + fileName);
        return "ADMIN".equals(userRole) || !fileName.contains("secret");
    }
}

