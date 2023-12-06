module.exports = {
    devServer: {
      proxy: {
        // 'api' url로 요청이 왔을 때 localhost:8080으로 통신한다
        '/api': {
          target: 'http://localhost:8080'
        }
      }
    }
}


