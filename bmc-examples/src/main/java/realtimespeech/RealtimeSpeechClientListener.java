/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package realtimespeech;

import com.oracle.bmc.aispeech.model.RealtimeMessageConnect;
import com.oracle.bmc.aispeech.model.RealtimeMessageAckAudio;
import com.oracle.bmc.aispeech.model.RealtimeMessageResult;

public interface RealtimeSpeechClientListener {
    // Feel free to set flags, perform cleanups, etc.
    // Note that this will be called in both server/client side closures.
    void onClose(int statusCode, String statusMessage);

    void onAckMessage(RealtimeMessageAckAudio ackMessage);

    void onResult(RealtimeMessageResult result);

    void onError(Throwable error);

    void onConnect();

    void onConnectMessage(RealtimeMessageConnect connectMessage);
}
