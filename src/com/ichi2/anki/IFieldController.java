package com.ichi2.anki;

import android.content.Context;
import android.content.Intent;
import android.widget.LinearLayout;

import com.ichi2.anki.multimediacard.IField;
import com.ichi2.anki.multimediacard.IMultimediaEditableNote;

public interface IFieldController {
	//This is guaranteed to be called before create UI, so that the controller is aware of the field, including type an content.
	void setField(IField field);
	//This is guaranteed to be called before create UI, so that the controller is aware of the note.
	void setNote(IMultimediaEditableNote note);
	//This is guaranteed to be called before create UI, so that the controller is aware of the field index in the note.
	void setFieldIndex(int index);
	
	//Layout is vertical inside a scroll view already
	void createUI(LinearLayout layout, Context context);
	//If the controller ever starts an activity for result, this is going to be called back on result.
	void onActivityResult(int requestCode, int resultCode, Intent data);
	
	//Is called to apply in the field new data from UI.
	void onDone();
}
