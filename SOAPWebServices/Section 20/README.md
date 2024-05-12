# SOAP Web Services 20 - wsimport Revisited

<img src="wsimport.JPG" alt="alt text" width="700"/>

1. When generating **Stubs** form **wsimport**, we can hide calling extra complexity.

- We can generate different **Java** classes form other **WSDL** files.
	- Local file.
	- Or website **WSDL**.

- Local file cannot figure out dependencies if **WSDL** has one.

- Its **preferred** to import form **WSDL** form **URL**.

- Some **wsimport** commands.

- `wsimport -d <directory>`
- `wsimport -keep `
- `wsimport -s <directory>`
- `wsimport -quiet`

- **Binding files** are XML files, that let you specific custom overrides. For example. names  

<img src="wsImportWithBinding.JPG" alt="alt text" width="700"/>

- **WSDL** with **binding file**.