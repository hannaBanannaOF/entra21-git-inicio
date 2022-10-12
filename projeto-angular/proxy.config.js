const proxy = [
    {
      context: '/',
      target: 'http://localhost:8080',
      pathRewrite: {'^/' : ''}
    }
  ];
  module.exports = proxy;