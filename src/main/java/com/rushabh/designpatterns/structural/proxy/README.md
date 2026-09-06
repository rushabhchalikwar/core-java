Proxy Pattern
=============

Overview
--------
This package demonstrates the Proxy design pattern. A Proxy provides a surrogate or placeholder for another object to control access to it, add lazy initialization, caching, access control, or logging without changing the underlying object's code.

Package contents
----------------
- Image (interface): Subject interface with display() and getFilename().
- HighResolutionImage (class): The real, expensive-to-create object that loads image data from disk.
- ImageProxy (class): Virtual Proxy that defers creation of HighResolutionImage until display() is called.
- SecureImageProxy (class): Protection Proxy that checks user roles/permissions before delegating to the real image.
- ImageGalleryApp (class): Demo application showing direct and proxied usage.

How it works
------------
Clients interact with Image instances. A proxy implements the same Image interface but controls access to the HighResolutionImage. ImageProxy performs lazy-loading (delays expensive load). SecureImageProxy enforces access control (returns access denied for unauthorized users).

Usage
-----
Run ImageGalleryApp.main() to see examples. Sample output (abridged):

Application Started. Initializing image proxies for gallery...
Loading image: photo1.jpg from disk (Expensive Operation)...
Image photo1.jpg loaded successfully.
Actual images loaded: photo1.jpg
Now displaying images in the gallery:
Displaying image: photo1.jpg

Now creating a proxy for another image (photo2.png)...
Image is not loaded yet. Filename: photo2.png
Loading image: photo2.png from disk (Expensive Operation)...
Image photo2.png loaded successfully.
Displaying image: photo2.png

When to use
-----------
- Lazy initialization for expensive-to-create objects.
- Access control and authorization checks before exposing a resource.
- Remote proxies for representing objects in other address spaces.
- Adding logging, caching, or other cross-cutting concerns without changing the real subject.

Benefits
--------
- Controls resource usage and access without modifying the real class.
- Promotes separation of concerns (security, caching, logging kept separate).

Notes
-----
This example simulates expensive image loading using Thread.sleep and large byte arrays. Real implementations would handle IO errors, resource cleanup, and more sophisticated permission checks.
