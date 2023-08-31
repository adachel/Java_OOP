package Lections.Lection2.Ex006.Interface;

import Lections.Lection2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
