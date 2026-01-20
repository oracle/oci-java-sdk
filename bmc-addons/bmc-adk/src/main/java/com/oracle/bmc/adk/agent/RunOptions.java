/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.agent;

import com.oracle.bmc.adk.utils.Constants;
import com.oracle.bmc.generativeaiagentruntime.model.PerformedAction;
import com.oracle.bmc.generativeaiagentruntime.model.RequiredAction;
import com.oracle.bmc.generativeaiagentruntime.responses.ChatResponse;
import java.util.Map;
import java.util.function.BiConsumer;

/** Builder class for creating RunOptions instances. */
public class RunOptions {

    private volatile String sessionId;
    private final String sessionName;
    private final String sessionDescription;
    private final Integer maxSteps;
    private final Boolean deleteSession;
    private final BiConsumer<RequiredAction, PerformedAction> onFulfilledRequiredAction;
    private final BiConsumer<Map<String, Object>, ChatResponse> onInvokedRemoteService;

    /**
     * Constructs a new RunOptions instance with the specified parameters.
     *
     * @param sessionId the unique identifier of the session
     * @param sessionName the name of the session
     * @param sessionDescription the description of the session
     * @param maxSteps the maximum number of steps allowed for the session
     * @param deleteSession whether the session should be deleted
     * @param onFulfilledRequiredAction the callback function to be executed when a required action
     *     is fulfilled
     * @param onInvokedRemoteService the callback function to be executed when a remote service is
     *     invoked
     */
    private RunOptions(
            String sessionId,
            String sessionName,
            String sessionDescription,
            Integer maxSteps,
            Boolean deleteSession,
            BiConsumer<RequiredAction, PerformedAction> onFulfilledRequiredAction,
            BiConsumer<Map<String, Object>, ChatResponse> onInvokedRemoteService) {
        this.sessionId = sessionId;
        this.sessionName = sessionName;
        this.sessionDescription = sessionDescription;
        this.maxSteps = maxSteps;
        this.deleteSession = deleteSession;
        this.onFulfilledRequiredAction = onFulfilledRequiredAction;
        this.onInvokedRemoteService = onInvokedRemoteService;
    }

    /**
     * Returns the unique identifier of the session.
     *
     * @return the session ID
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Returns the name of the session.
     *
     * @return the session name
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * Returns the description of the session.
     *
     * @return the session description
     */
    public String getSessionDescription() {
        return sessionDescription;
    }

    /**
     * Returns the maximum number of steps allowed for the session.
     *
     * @return the maximum number of steps, or null if not specified
     */
    public Integer getMaxSteps() {
        return maxSteps;
    }

    /**
     * Returns whether the session should be deleted.
     *
     * @return true if the session should be deleted, false otherwise
     */
    public Boolean getDeleteSession() {
        return deleteSession;
    }

    /**
     * Sets the unique identifier of the session.
     *
     * @param sessionId the new session ID
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * Returns the callback function to be executed when a required action is fulfilled. The
     * callback function takes two parameters: the required action and the performed action.
     *
     * @return a BiConsumer that consumes a RequiredAction and a PerformedAction object
     */
    public BiConsumer<RequiredAction, PerformedAction> getOnFulfilledRequiredAction() {
        return onFulfilledRequiredAction;
    }

    /**
     * Returns the callback function to be executed when a remote service is invoked. The callback
     * function takes two parameters: a map of input parameters and the response from the chat.
     *
     * @return a BiConsumer that consumes a Map of input parameters and a ChatResponse object
     */
    public BiConsumer<Map<String, Object>, ChatResponse> getOnInvokedRemoteService() {
        return onInvokedRemoteService;
    }

    public static class RunOptionsBuilder {
        private String sessionId;
        private String sessionName;
        private String sessionDescription;
        private Integer maxSteps;
        private Boolean deleteSession;
        private BiConsumer<RequiredAction, PerformedAction> onFulfilledRequiredAction;
        private BiConsumer<Map<String, Object>, ChatResponse> onInvokedRemoteService;

        public RunOptionsBuilder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public RunOptionsBuilder sessionName(String sessionName) {
            this.sessionName = sessionName;
            return this;
        }

        public RunOptionsBuilder sessionDescription(String sessionDescription) {
            this.sessionDescription = sessionDescription;
            return this;
        }

        public RunOptionsBuilder maxSteps(Integer maxSteps) {
            this.maxSteps = maxSteps;
            return this;
        }

        public RunOptionsBuilder deleteSession(Boolean deleteSession) {
            this.deleteSession = deleteSession;
            return this;
        }

        public RunOptionsBuilder onFulfilledRequiredAction(
                BiConsumer<RequiredAction, PerformedAction> onFulfilledRequiredAction) {
            this.onFulfilledRequiredAction = onFulfilledRequiredAction;
            return this;
        }

        public RunOptionsBuilder onInvokedRemoteService(
                BiConsumer<Map<String, Object>, ChatResponse> onInvokedRemoteService) {
            this.onInvokedRemoteService = onInvokedRemoteService;
            return this;
        }

        public RunOptions build() {
            boolean hasSessionId = sessionId != null;
            boolean customSessionName = sessionName != null;
            boolean customSessionDescription = sessionDescription != null;

            if (hasSessionId && (customSessionName || customSessionDescription)) {
                throw new IllegalArgumentException(
                        "Cannot provide sessionId along with sessionName or sessionDescription.");
            }

            return new RunOptions(
                    sessionId,
                    customSessionName ? sessionName : Constants.DEFAULT_SESSION_NAME,
                    customSessionDescription
                            ? sessionDescription
                            : Constants.DEFAULT_SESSION_DESCRIPTION,
                    maxSteps != null ? maxSteps : Constants.DEFAULT_MAX_STEP,
                    deleteSession != null ? deleteSession : false,
                    onFulfilledRequiredAction,
                    onInvokedRemoteService);
        }
    }

    /**
     * Creates a new instance of the {@link RunOptionsBuilder} to construct a {@link RunOptions}
     * object.
     *
     * @return a new {@link RunOptionsBuilder} instance
     */
    public static RunOptionsBuilder builder() {
        return new RunOptionsBuilder();
    }
}
