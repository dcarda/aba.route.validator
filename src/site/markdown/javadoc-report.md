<iframe
    id="apiDocsFrame"
    src="./apidocs/index.html"
    title="API Documentation"
    scrolling="no"
    style="
        width: 100%;
        height: 1000px;
        border: none;
        display: block;
    ">
</iframe>

<script>
    const iframe = document.getElementById('apiDocsFrame');

    iframe.addEventListener('load', function () {
        try {
            const doc = iframe.contentDocument;

            function adjustHeight() {
                const height = Math.max(
                    doc.body.scrollHeight,
                    doc.documentElement.scrollHeight
                );

                iframe.style.height = height + 'px';
            }

            adjustHeight();

            const observer = new ResizeObserver(adjustHeight);

            observer.observe(doc.documentElement);
            observer.observe(doc.body);

        } catch (error) {
            console.error('Unable to resize Javadoc iframe:', error);
        }
    });
</script>
