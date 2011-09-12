package com.koushikdutta.rommanager.api;

import com.koushikdutta.rommanager.api.IClockworkRecoveryScriptBuilder;

interface IROMManagerAPIService {
	boolean isPremium();
	IClockworkRecoveryScriptBuilder createClockworkRecoveryScriptBuilder();
	void installZip(String path);
}
