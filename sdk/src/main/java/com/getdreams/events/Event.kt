/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package com.getdreams.events

import org.json.JSONObject

sealed class Event {
    /**
     * Event sent when token has expired.
     */
    object IdTokenExpired : Event()

    /**
     * Telemetry event.
     *
     * @param name The name of the telemetry.
     * @param payload The optional payload.
     */
    data class Telemetry(val name: String, val payload: JSONObject?) : Event()
}
