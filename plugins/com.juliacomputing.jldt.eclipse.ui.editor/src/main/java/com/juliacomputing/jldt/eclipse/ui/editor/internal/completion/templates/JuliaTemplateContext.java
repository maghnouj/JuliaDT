package com.juliacomputing.jldt.eclipse.ui.editor.internal.completion.templates;

import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.ui.templates.ScriptTemplateContext;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.templates.TemplateContextType;

public class JuliaTemplateContext extends ScriptTemplateContext {
  protected JuliaTemplateContext(TemplateContextType type, IDocument document,
      int completionOffset, int completionLength, ISourceModule sourceModule) {
    super(type, document, completionOffset, completionLength, sourceModule);
  }
}
