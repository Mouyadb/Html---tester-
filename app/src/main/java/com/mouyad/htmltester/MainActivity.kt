package com.mouyad.htmltester

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView
    private lateinit var htmlInput: EditText
    private lateinit var renderButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webview)
        htmlInput = findViewById(R.id.html_input)
        renderButton = findViewById(R.id.render_button)

        // Configure WebView
        webView.apply {
            webViewClient = WebViewClient()
            settings.apply {
                javaScriptEnabled = true
                domStorageEnabled = true
            }
        }

        // Load default HTML
        val defaultHtml = """
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        padding: 20px;
                        background-color: #f5f5f5;
                    }
                    h1 { color: #333; }
                    p { color: #666; }
                </style>
            </head>
            <body>
                <h1>Welcome to HTML Tester!</h1>
                <p>Enter your HTML code in the input field above and tap "Render" to preview it.</p>
            </body>
            </html>
        """.trimIndent()

        htmlInput.setText(defaultHtml)
        loadHtmlInWebView(defaultHtml)

        // Render button click listener
        renderButton.setOnClickListener {
            val htmlCode = htmlInput.text.toString()
            if (htmlCode.isNotEmpty()) {
                loadHtmlInWebView(htmlCode)
            }
        }
    }

    private fun loadHtmlInWebView(htmlCode: String) {
        webView.loadData(htmlCode, "text/html; charset=utf-8", "utf-8")
    }
}
