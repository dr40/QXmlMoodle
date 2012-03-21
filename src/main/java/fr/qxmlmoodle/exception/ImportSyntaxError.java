package fr.qxmlmoodle.exception;

/** Class ImportSyntaxError error concern XML syntax. */

    /** Default constructor. */
        super(ImportErrorType.SYNTAX);
    }
    public ImportSyntaxError(final int line, final String tag) {
        super(ImportErrorType.SYNTAX, line , tag, "Syntax Error");
    }
    public ImportSyntaxError(final int line, final String tag,
        super(ImportErrorType.SYNTAX, line , tag, desc);
    }
}