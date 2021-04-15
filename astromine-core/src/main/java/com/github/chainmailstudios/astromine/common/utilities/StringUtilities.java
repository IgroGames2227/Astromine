/*
 * MIT License
 *
 * Copyright (c) 2020, 2021 Mixinors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.chainmailstudios.astromine.common.utilities;

import net.minecraft.network.PacketByteBuf;

import com.github.chainmailstudios.astromine.AstromineCommon;
import io.netty.buffer.ByteBuf;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class StringUtilities {
    /** Serializes the given {@link String} to a {@link ByteBuf}. */
    public static void toPacket(PacketByteBuf buffer, String string) {
        buffer.writeString(string);
    }

    /** Deserializes a {@link String} from a {@link ByteBuf}. */
    public static String fromPacket(PacketByteBuf buffer) {
        return buffer.readString();
    }

    /** Serializes the given {@link String} to a {@link JsonElement}. */
    public static JsonElement toJson(String string) {
        return new JsonPrimitive(string);
    }

    /** Deserializes a {@link String} from a {@link JsonElement}. */
    public static String fromJson(JsonElement json) {
        return AstromineCommon.GSON.fromJson(json, String.class);
    }
}