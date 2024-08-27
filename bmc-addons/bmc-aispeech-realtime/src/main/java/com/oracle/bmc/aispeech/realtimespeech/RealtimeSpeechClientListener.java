/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.realtimespeech;

import com.oracle.bmc.aispeech.model.RealtimeMessageConnect;
import com.oracle.bmc.aispeech.model.RealtimeMessageAckAudio;
import com.oracle.bmc.aispeech.model.RealtimeMessageResult;

/**
 * This is the RealtimeSpeechClientListner Interface. This is meant to be extended so that users can
 * determine the behavior of the client.
 */
public interface RealtimeSpeechClientListener {

    /**
     * Connection to the realtime speech service closed. You may use this to perform cleanups, free
     * resources, etc.
     *
     * @param statusCode
     * @param statusMessage
     */
    void onClose(int statusCode, String statusMessage);

    /**
     * An ack message was received
     *
     * @param ackMessage
     */
    void onAckMessage(RealtimeMessageAckAudio ackMessage);

    /**
     * A result was obtained
     *
     * @param result
     */
    void onResult(RealtimeMessageResult result);

    /**
     * An error occured in the realtime speech client.
     *
     * @param error
     */
    void onError(Throwable error);

    /** A websocket connection was established with the realtime speech service. */
    void onConnect();

    /**
     * The service sent a connect message after establishing the websocket connection.
     *
     * @param connectMessage
     */
    void onConnectMessage(RealtimeMessageConnect connectMessage);
}
