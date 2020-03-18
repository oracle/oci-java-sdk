/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.requests.UploadPartRequest;
import com.oracle.bmc.objectstorage.responses.UploadPartResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * MultiPartTransferManager handles the job submission, cancellation, and completion
 * of parts to the manifest.
 */
@RequiredArgsConstructor
@Slf4j
public class MultipartTransferManager {
    private static final int MAX_RANDOM_SLEEP_BEFORE_UPLOAD_START_MS = 1000;
    private final SecureRandom random = new SecureRandom();
    private final ExecutorService executor;
    private final MultipartManifestImpl manifest;
    private final ObjectStorage client;

    private final List<Future<Void>> responses = new ArrayList<>();

    public synchronized void startTransfer(final UploadPartRequest request) {
        if (executor.isShutdown()) {
            throw new CancellationException("Executor used for transfers has been shutdown");
        }
        manifest.registerTransfer(request.getUploadPartNum());

        Future<Void> futureResponse =
                executor.submit(
                        new Callable<Void>() {
                            @Override
                            public Void call() throws Exception {
                                try {
                                    // Use a random sleep before each part begins upload.  Too many concurrent requests
                                    // starting around the same time leads to 409 conflicts.
                                    Thread.sleep(
                                            random.nextInt(
                                                    MAX_RANDOM_SLEEP_BEFORE_UPLOAD_START_MS));
                                    UploadPartResponse response = client.uploadPart(request);
                                    manifest.registerSuccess(request.getUploadPartNum(), response);
                                } catch (Exception e) {
                                    LOG.error(
                                            "Failed to upload part " + request.getUploadPartNum(),
                                            e);
                                    manifest.registerFailure(request.getUploadPartNum());
                                }
                                return null;
                            }
                        });
        responses.add(futureResponse);
    }

    public void awaitCompletion() {
        for (Future<Void> f : responses) {
            try {
                f.get();
            } catch (InterruptedException e) {
                LOG.info("Thread interrupted while waiting for transfer completion", e);
                Thread.currentThread().interrupt();
                return;
            } catch (ExecutionException e) {
                LOG.info("Execution exception while waiting for transfer completion", e);
            }
        }
    }

    public void abortAll() {
        for (Future<Void> f : responses) {
            f.cancel(true);
        }
    }
}
