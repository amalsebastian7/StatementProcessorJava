# StatementProcessor

**Status:** Planned Project  

StatementProcessor is a Java-based project intended to automate the extraction and processing of bank statements (CSV/PDF files) for further analysis or database insertion. This project is designed with industry best practices in mind, including modular code, Maven for dependency management, and secure handling of credentials.

---

## **Project Goals**
- Read and parse CSV and PDF bank statements from a local NAS or file system.
- Extract transaction data (date, description, debit/credit, balance).
- Transform and clean data for further processing.
- Output processed data to a CSV file (initial phase) or SQL database (future phase).
- Maintain secure handling of credentials and sensitive files.

---

## **Planned Features**
- Modular Java code with clear separation of concerns.
- Use of Maven for dependency management and build lifecycle.
- Safe handling of sensitive configuration via `.properties` files or environment variables.
- Dummy files for testing to avoid exposure of real bank statements.
- Logging for traceability and debugging.

---

## **Project Structure (Planned)**
