package com.juliacomputing.jldt.eclipse.ui.editor.internal;

import com.juliacomputing.jldt.eclipse.ui.editor.JuliaEditorPlugin;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPreferencePage;
import org.eclipse.dltk.ui.preferences.EditorConfigurationBlock;
import org.eclipse.dltk.ui.preferences.IPreferenceConfigurationBlock;
import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;

public class JuliaEditorPreferencesPage extends AbstractConfigurationBlockPreferencePage {

    @Override
    protected void setDescription() {
        this.setDescription("Julia Editor preferences");
    }

    @Override
    protected void setPreferenceStore() {
        this.setPreferenceStore(JuliaEditorPlugin.getDefault().getPreferenceStore());
    }

    @Override
    protected IPreferenceConfigurationBlock createConfigurationBlock(
            OverlayPreferenceStore overlayPreferenceStore) {
        return new EditorConfigurationBlock(this, overlayPreferenceStore,
                EditorConfigurationBlock.FLAG_TAB_ALWAYS_INDENT);
    }
}
