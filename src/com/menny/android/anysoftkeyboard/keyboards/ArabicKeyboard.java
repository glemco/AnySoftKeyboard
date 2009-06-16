package com.menny.android.anysoftkeyboard.keyboards;

import android.content.Context;

import com.menny.android.anysoftkeyboard.R;

public class ArabicKeyboard extends AnyKeyboard/* implements HardKeyboardTranslator*/
{
	public ArabicKeyboard(Context context) 
	{
		super(context, R.xml.arabic_qwerty, false, R.string.arabic_keyboard, "arabic_keyboard", false);
	}

	@Override
	public int getKeyboardIcon() 
	{
		return R.drawable.ar;
	}
}
